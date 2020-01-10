package com.lotusss.androidanimation

import android.view.View
import android.view.ViewTreeObserver

fun View.onGlobalLayout(callback: () -> Unit) {
    val viewTreeObserver = this.viewTreeObserver
    viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
                getViewTreeObserver().removeOnGlobalLayoutListener(this)
            } else {
                getViewTreeObserver().removeGlobalOnLayoutListener(this)
            }
            callback()
        }
    })
}