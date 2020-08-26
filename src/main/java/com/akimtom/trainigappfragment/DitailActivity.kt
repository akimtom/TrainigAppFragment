package com.akimtom.trainigappfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DitailActivity : AppCompatActivity() {
companion object{
    val EXTRA_WORKOUT_ID = "id"
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ditail)
        val frag:WorkOutDetailFragment =
            supportFragmentManager.findFragmentById(R.id.detail_fr) as WorkOutDetailFragment
        var workoutID = intent.extras?.get(EXTRA_WORKOUT_ID) as Int
        frag.setWorkOut(workoutID)

    }

}