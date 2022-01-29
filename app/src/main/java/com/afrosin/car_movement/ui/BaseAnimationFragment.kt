package com.afrosin.car_movement.ui

import android.content.Context
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.afrosin.car_movement.R
import com.afrosin.car_movement.databinding.FragmentBaseAnimationBinding
import com.afrosin.car_movement.mvp.resource.ResourceProvider
import javax.inject.Inject

abstract class BaseAnimationFragment : Fragment() {
    protected var ivTaxi: View? = null
    protected var mFrameLayout: View? = null
    protected var mScreenHeight = 0f

    private var _binding: FragmentBaseAnimationBinding? = null

    private val binding: FragmentBaseAnimationBinding
        get() = checkNotNull(_binding) { getString(R.string.binding_error) }

    @Inject
    lateinit var resourceProvider: ResourceProvider

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBaseAnimationBinding.inflate(inflater, container, false)
        ivTaxi = binding.ivTaxi

        mFrameLayout = binding.container
        mFrameLayout!!.setOnClickListener { onStartAnimation() }


        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val displayMetrics = DisplayMetrics()


        (resourceProvider.getAppContext().getSystemService(Context.WINDOW_SERVICE) as WindowManager)
            .defaultDisplay.getMetrics(displayMetrics)


        mScreenHeight = displayMetrics.heightPixels.toFloat()
    }

    protected abstract fun onStartAnimation()

    companion object {
        const val DEFAULT_ANIMATION_DURATION = 2500L
    }
}
