package com.lotusss.androidanimation.simpleDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lotusss.androidanimation.R
import kotlinx.android.synthetic.main.activity_motion.*

class MotionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion)

        var isStartPosition = true
        startAnimBtn?.setOnClickListener {
            if (isStartPosition) {
                motionContainer.transitionToEnd()
            } else {
                motionContainer.transitionToStart()
            }
            isStartPosition = !isStartPosition
        }
    }
}
