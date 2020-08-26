package com.akimtom.trainigappfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(),WorkListFragment.Listener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    override fun itemCli(id: Long) {
      val intent = Intent(this,DitailActivity::class.java)
        intent.putExtra(DitailActivity.EXTRA_WORKOUT_ID,id.toInt())
        startActivity(intent)
    }
}