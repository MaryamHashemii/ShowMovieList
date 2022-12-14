package com.boomino.test.presentation.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.boomino.test.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashFragmentToProductFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_productFragment)
  }
}
