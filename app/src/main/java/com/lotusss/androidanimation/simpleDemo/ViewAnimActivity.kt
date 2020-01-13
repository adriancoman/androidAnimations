package com.lotusss.androidanimation.simpleDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.ImageView
import com.lotusss.androidanimation.R
import kotlinx.android.synthetic.main.activity_view_anim.*
import kotlin.random.Random

class ViewAnimActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_anim)

        spawnBtn?.setOnClickListener {
            spawnImages()
        }
    }

    private fun spawnImages() {
        for (i in 0..20) {
            parentView.addView(
                ImageView(this).apply {
                    setImageResource(R.drawable.ic_adb)
                    alpha = 0f
                    x = spawnBtn.x
                    y = spawnBtn.y
                }
            )
        }
        for (i in 0..parentView.childCount) {
            val maxWidth = parentView.measuredWidth / 3

            val yPosition = MIN_Y_DISTANCE + Random.nextInt(90).toFloat()
            val xPosition = if (Random.nextInt(2) == 1) {
                1
            } else {
                -1
            } * Random.nextInt(maxWidth).toFloat()

            val scaleDimension = if (Random.nextInt(2) == 1) {
                1
            } else {
                2
            } * Random.nextFloat()

            val rotation = if (Random.nextInt(2) == 1) {
                1
            } else {
                -1
            } * Random.nextInt(360).toFloat()

            (parentView?.getChildAt(i) as? ImageView)?.apply {
                animate()
                    .alpha(1f)
                    .duration = 400

                animate()
                    .translationYBy(yPosition)
                    .translationXBy(xPosition)
                    .scaleX(scaleDimension)
                    .scaleY(scaleDimension)
                    .rotationBy(rotation)
                    .setInterpolator(AccelerateDecelerateInterpolator())
                    .setDuration(ANIM_DURATION)
                    .start()

            }
        }
    }

    companion object {
        const val ANIM_DURATION = 1000L
        const val MIN_Y_DISTANCE = 400L
    }
}
