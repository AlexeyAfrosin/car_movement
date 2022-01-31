package com.afrosin.car_movement.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.afrosin.car_movement.R
import com.afrosin.car_movement.databinding.FragmentCarMovingBinding
import com.afrosin.car_movement.mvp.presenter.CarMovingPresenter
import com.afrosin.car_movement.mvp.resource.ResourceProvider
import com.afrosin.car_movement.mvp.view.CarMovingView
import com.afrosin.car_movement.ui.App
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import javax.inject.Inject

class CarMovingFragment : MvpAppCompatFragment(), CarMovingView {
//    companion object {
//
//        fun newInstance() = CarMovingFragment()
//        const val DEFAULT_ANIMATION_DURATION = 2500L
//    }
    companion object {
        fun newInstance() = CarMovingFragment()
    }

    protected var ivTaxi: View? = null
    protected var mFrameLayout: View? = null
    protected var mScreenHeight = 0f

    @InjectPresenter
    lateinit var presenter: CarMovingPresenter
//
//    @ProvidePresenter
//    fun providePresenter() = CarMovingPresenter().apply {
//        App.instance.appComponent.inject(this)
//    }

    private var _binding: FragmentCarMovingBinding? = null

    private val binding: FragmentCarMovingBinding
        get() = checkNotNull(_binding) { getString(R.string.binding_error) }

    @Inject
    lateinit var resourceProvider: ResourceProvider
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCarMovingBinding.inflate(inflater, container, false)
        return _binding?.root
    }
    //    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//
//        _binding = FragmentCarMovingBinding.inflate(inflater, container, false)
//        ivTaxi = binding.ivTaxi
//
//        mFrameLayout = binding.container
//        mFrameLayout!!.setOnClickListener { onStartAnimation() }
//
//
//        return binding.root
//    }

//    override fun onResume() {
//        super.onResume()
//        val displayMetrics = DisplayMetrics()
//
//
//        (resourceProvider.getAppContext().getSystemService(Context.WINDOW_SERVICE) as WindowManager)
//            .defaultDisplay.getMetrics(displayMetrics)
//
//
//        mScreenHeight = displayMetrics.heightPixels.toFloat()
//    }

    private fun onStartAnimation(){

    }

    override fun init() {
        ivTaxi = binding.ivTaxi
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}