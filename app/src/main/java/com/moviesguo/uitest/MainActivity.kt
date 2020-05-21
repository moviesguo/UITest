package com.moviesguo.uitest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = ContextCompat.getColor(this,R.color.colorPrimaryDark)
        btn_ca.setOnClickListener { startActivity<CAActivity>() }
        btn_cc.setOnClickListener { startActivity<CCActivity>() }
        btn_cac.setOnClickListener { startActivity<CACActivity>() }
        btn_clc.setOnClickListener { startActivity<CLCActivity>() }
        btn_c.setOnClickListener { startActivity<CActivity>() }
    }

    //不知道这么写有没有问题
    private inline fun <reified T> Context.startActivity() {
        startActivity(Intent(this, T::class.java))
    }

}
