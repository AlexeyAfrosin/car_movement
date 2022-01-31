package com.afrosin.car_movement.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.afrosin.car_movement.R
import com.afrosin.car_movement.databinding.FragmentCarMovingBinding
import com.afrosin.car_movement.mvp.presenter.CarMovingPresenter
import com.afrosin.car_movement.mvp.view.CarMovingView
import com.afrosin.car_movement.ui.App
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter


class CarMovingFragment : MvpAppCompatFragment(), CarMovingView {

    companion object {
        fun newInstance() = CarMovingFragment()
    }

    @InjectPresenter
    lateinit var presenter: CarMovingPresenter

    @ProvidePresenter
    fun providePresenter() = CarMovingPresenter().apply {
        App.instance.appComponent.inject(this)
    }

    private var _binding: FragmentCarMovingBinding? = null

    private val binding: FragmentCarMovingBinding
        get() = checkNotNull(_binding) { getString(R.string.binding_error) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCarMovingBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun init() {
        initListeners()
    }

    private fun initListeners() {
        binding.ivTaxi.setOnClickListener { binding.flAnimation.transitionToEnd() }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}