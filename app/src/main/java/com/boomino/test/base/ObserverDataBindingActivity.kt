package com.boomino.test.base

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding

abstract class ObserverDataBindingActivity<T : ViewDataBinding>(@LayoutRes layoutRes: Int) :
    BaseDataBindingActivity<T>(layoutRes) {

    override fun onStart() {
        super.onStart()
        observe()
    }

    protected abstract fun observe()

}