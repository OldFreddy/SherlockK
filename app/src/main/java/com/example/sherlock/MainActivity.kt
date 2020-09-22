package com.example.sherlock

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


const val CHOOSE_THIEF: Int = 0

class MainActivity : AppCompatActivity() {
    lateinit var thiefNAAME: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {

            val questionIntent = Intent(this, chooseActivity::class.java)
            startActivityForResult(questionIntent, CHOOSE_THIEF)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CHOOSE_THIEF) {
            if (resultCode == RESULT_OK) {
                thiefNAAME = data?.getStringExtra(THIEF).toString()

                textView.text = thiefNAAME
            }
        }
    }
}