package com.example.contacts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create)

        val photo = findViewById<ImageButton>(R.id.Photo)
        val bname = findViewById<EditText>(R.id.Name)
        val bno = findViewById<EditText>(R.id.contactnumber)
        val save = findViewById<Button>(R.id.addContact)


        save.setOnClickListener {
            val nameinput = bname.text.toString()
            val numberinput = bno.text.toString()

            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("NAME", nameinput)
                putExtra("NUMBER", numberinput)
            }
            startActivity(intent)
            finish()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}