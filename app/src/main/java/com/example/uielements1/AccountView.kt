package com.example.uielements1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AccountView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_view)

        val intent = getIntent()

        val name_first = findViewById<TextView>(R.id.first_name)
        val name_last = findViewById<TextView>(R.id.last_name)
        val view_age = findViewById<TextView>(R.id.age_view)
        val birthday = findViewById(R.id.birth) as TextView
        val view_email = findViewById<TextView>(R.id.email_view)
        val phone_view = findViewById<TextView>(R.id.phone_number)

        val nameFirst = intent.getStringExtra("first")
        val nameLast = intent.getStringExtra("last")
        val viewAge = intent.getStringExtra("age")
        val birth_day = intent.getStringExtra("Date")
        val email_view = intent.getStringExtra("email")
        val view_phone = intent.getStringExtra("phone")

        name_first.setText("First Name: " + nameFirst)
        name_last.text = "Last Name: " + nameLast
        view_age.text = "Age: " + viewAge
        birthday.text = "Birthday: " + birth_day
        view_email.text = "Email: " + email_view
        phone_view.text = "Phone Number: " + view_phone
    }
}