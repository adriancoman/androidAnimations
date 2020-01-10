package com.lotusss.androidanimation.sameAnim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lotusss.androidanimation.R
import kotlinx.android.synthetic.main.activity_circle_motion.*

class CircleMotionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_motion)


        var isStartPosition = true
        mainBtn?.setOnClickListener {
            if (isStartPosition) {
                motionContainer.transitionToEnd()
            } else {
                motionContainer.transitionToStart()
            }
            isStartPosition = !isStartPosition
        }
    }
}
