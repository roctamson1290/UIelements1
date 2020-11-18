package com.example.uielements1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent2 = Intent(this, NextPage::class.java)

        val fname = findViewById<EditText>(R.id.firstName)
        val lname = findViewById(R.id.lastName) as EditText
        val email = findViewById(R.id.emailAddress) as EditText
        val tv_age = findViewById(R.id.ageView) as TextView
        val switchNum = findViewById(R.id.switchNumber) as Switch
        val pnumber = findViewById(R.id.phoneNumber) as EditText

        findViewById<SeekBar>(R.id.ageBar).setOnSeekBarChangeListener(
                object: SeekBar.OnSeekBarChangeListener{
                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                        tv_age.text = "Age: " + progress.toString()
                        val getAge = progress.toString()
                        intent2.putExtra("age", getAge)
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {

                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {

                    }
                }
        )

        switchNum.setOnCheckedChangeListener { compoundButton, b ->
            if(switchNum.isChecked){
                pnumber.isVisible = true
            }
            else{
                pnumber.isVisible = false
            }
        }

        findViewById<Button>(R.id.nextPage).setOnClickListener{
            val Name1 = fname.text.toString()
            val Name2 = lname.text.toString()
            val email1 = email.text.toString()
            val phone_Number = pnumber.text.toString()

            intent2.putExtra("first", Name1)
            intent2.putExtra("last", Name2)
            intent2.putExtra("email", email1)
            intent2.putExtra("phone", phone_Number)
            startActivity(intent2)
        }
    }
}