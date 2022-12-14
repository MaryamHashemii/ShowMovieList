package com.boomino.test.util.extensions

import android.content.Context
import android.view.View
import android.widget.Toast

fun Context.toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}