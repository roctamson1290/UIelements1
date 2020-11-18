package com.example.uielements1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView

class NextPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)

        val intent1 = Intent(this, AccountView::class.java)

        val nameFirst = intent.getStringExtra("first")
        val nameLast = intent.getStringExtra("last")
        val viewAge = intent.getStringExtra("age")
        val email_view = intent.getStringExtra("email")
        val view_phone = intent.getStringExtra("phone")

        findViewById<CalendarView>(R.id.calendarView).setOnDateChangeListener { calendarView, i, i2, i3 ->
            val month = i2 + 1
            val date = "$i3/$month/$i"
            intent1.putExtra("first", nameFirst)
            intent1.putExtra("last", nameLast)
            intent1.putExtra("age", viewAge)
            intent1.putExtra("Date", date)
            intent1.putExtra("email", email_view)
            intent1.putExtra("phone", view_phone)

            findViewById<Button>(R.id.completeBtn).setOnClickListener { startActivity(intent1) }
        }
    }
}