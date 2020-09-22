package com.example.sherlock

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


const val THIEF: String = "ru.oldfredddy.sherlock.THIEF"

class chooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
    }

    fun onRadioClick(v: View) {
        var answerIntent = Intent(this, MainActivity::class.java)


        when (v.id) {
            R.id.radioDog -> answerIntent.putExtra(THIEF, "DOG")
            R.id.radioCat -> answerIntent.putExtra(THIEF, "CAT")
            R.id.radioCrow -> answerIntent.putExtra(THIEF, "CROW")

            else -> {
                answerIntent.putExtra(THIEF, "WHO??????")
            }
        }

        setResult(RESULT_OK, answerIntent);
        finish()

    }
}