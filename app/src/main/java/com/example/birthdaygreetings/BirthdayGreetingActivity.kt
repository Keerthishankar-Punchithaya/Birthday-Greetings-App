package com.example.birthdaygreetings

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.view.accessibility.AccessibilityViewCommand
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)


//        val birthdayGreeting: EditText = findViewById<EditText>(R.id.birthdayGreeting)
        birthdayGreeting.text = "Happy Birthday\n$name!"



//
//        birthdayGreeting.text = "Happy Birthday $name"

//        textview.text = Editable.Factory.getInstance().newEditable("your text")


        //"Happy Birthday $name".also { birthdayGreeting.text = it }

        //val nameInput = findViewById<EditText>(R.id.nameInput)


        //val text = birthdayGreeting.setText = "Happy Birthday $name"
        //birthdayGreeting.text() = "Happy Birthday $name"

    }
}