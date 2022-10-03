package com.boomino.test.presentation.splash

import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.boomino.test.R
import com.boomino.test.base.BaseDataBindingFragment
import com.boomino.test.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashFragment:BaseDataBindingFragment<FragmentSplashBinding>(R.layout.fragment_splash) {
    override fun setupViews() {
        lifecycleScope.launch {
            delay(2000L)
            findNavController().navigate(R.id.action_splashFragment_to_productFragment)
        }

    }
}