package com.moviesguo.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

/**
 * ConstraintLayout
 */
class CActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    }
}
