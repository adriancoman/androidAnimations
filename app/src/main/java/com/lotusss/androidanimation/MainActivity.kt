package com.lotusss.androidanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lotusss.androidanimation.sameAnim.CircleAnimationActivity
import com.lotusss.androidanimation.sameAnim.CircleMotionActivity
import com.lotusss.androidanimation.simpleDemo.MotionActivity
import com.lotusss.androidanimation.simpleDemo.ViewAnimActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToViewAnimBtn.setOnClickListener {
            startActivity(Intent(this, ViewAnimActivity::class.java))
        }
        goToMotionBtn.setOnClickListener {
            startActivity(Intent(this, MotionActivity::class.java))
        }
        goToCircleMotionBtn.setOnClickListener {
            startActivity(Intent(this, CircleMotionActivity::class.java))
        }
        goToCircleAnimationBtn.setOnClickListener {
            startActivity(Intent(this, CircleAnimationActivity::class.java))
        }
    }
}
