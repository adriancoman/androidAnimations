package com.lotusss.androidanimation.simpleDemo

import android.animation.ValueAnimator
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.vectordrawable.graphics.drawable.ArgbEvaluator
import com.lotusss.androidanimation.R
import kotlinx.android.synthetic.main.activity_value_animator.*

class ValueAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_value_animator)

        actionBtn.setOnClickListener {
            val anim = ValueAnimator.ofArgb(
                ContextCompat.getColor(this, R.color.colorPrimary),
                ContextCompat.getColor(this, R.color.colorAccent)
            )
            anim.duration = 500
            anim.addUpdateListener {  animator ->
                (backgroundCircle?.background as? GradientDrawable)?.setColor(animator.animatedValue as Int)
            }
            anim.start()
        }
    }
}
