package com.lotusss.androidanimation.sharedElement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shared_element_one.*
import androidx.core.view.ViewCompat
import androidx.core.app.ActivityOptionsCompat
import android.content.Intent
import android.transition.Explode

class SharedElementOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.lotusss.androidanimation.R.layout.activity_shared_element_one)
        with(window) {
            exitTransition = Explode()
        }

        imageView?.setOnClickListener {
            val intent = Intent(this, SharedElementTwoActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                imageView,
                requireNotNull(ViewCompat.getTransitionName(imageView))
            )
            startActivity(intent, options.toBundle())
        }
    }
}
