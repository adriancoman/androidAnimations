package com.lotusss.androidanimation.sharedElement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.view.Window
import com.lotusss.androidanimation.R

class SharedElementTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_element_two)

        with(window) {
            enterTransition = Explode()
        }
    }
}
