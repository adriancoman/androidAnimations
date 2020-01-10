package com.lotusss.androidanimation.sameAnim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lotusss.androidanimation.R
import kotlinx.android.synthetic.main.activity_circle_animation_activity.*

class CircleAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_animation_activity)

        var isInitialPos = true

        mainBtn.setOnClickListener {
            if (isInitialPos) {
                btnTop
                    .animate()
                    .translationYBy(-btnTop.height.div(2) - mainBtn.height.div(2).toFloat())
                    .setDuration(ANIM_DURATION)
                    .start()

                btnTopLeft
                    .animate()
                    .translationYBy(-mainBtn.height.div(2).toFloat())
                    .translationXBy(-mainBtn.height.div(2).toFloat())
                    .setDuration(ANIM_DURATION)
                    .start()

                btnTopRight
                    .animate()
                    .translationYBy(-mainBtn.height.div(2).toFloat())
                    .translationXBy(mainBtn.height.div(2).toFloat())
                    .setDuration(ANIM_DURATION)
                    .start()
            } else {
                btnTop
                    .animate()
                    .translationYBy(btnTop.height.div(2) + mainBtn.height.div(2).toFloat())
                    .setDuration(ANIM_DURATION)
                    .start()

                btnTopLeft
                    .animate()
                    .translationYBy(mainBtn.height.div(2).toFloat())
                    .translationXBy(mainBtn.height.div(2).toFloat())
                    .setDuration(ANIM_DURATION)
                    .start()

                btnTopRight
                    .animate()
                    .translationYBy(mainBtn.height.div(2).toFloat())
                    .translationXBy(-mainBtn.height.div(2).toFloat())
                    .setDuration(ANIM_DURATION)
                    .start()
            }
            isInitialPos = !isInitialPos
        }
    }

    companion object {
        const val ANIM_DURATION = 1000L
    }
}
