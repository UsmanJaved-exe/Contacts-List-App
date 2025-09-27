package com.example.contacts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.R1)
        val b1 = findViewById<Button>(R.id.button)
        val data = ArrayList<model>()

        b1.setOnClickListener {
            val add = Intent(this, Create::class.java)
            startActivity(add)
        }

        val fromCREATE = intent
        val name = fromCREATE.getStringExtra("NAME")
        val number = fromCREATE.getStringExtra("NUMBER")

if(name!=null && number!=null) {
    val newContact = model(R.drawable.user,name, number)
    data.add(newContact)
}


        val m1 = model(R.drawable.user, "John Doe", "1111111111")
        val m2 = model(R.drawable.user, "Jane Smith", "2222222222")
        val m3 = model(R.drawable.user, "Mike Johnson", "3333333333")
        val m4 = model(R.drawable.user, "Emily Davis", "4444444444")
        val m5 = model(R.drawable.user, "Chris Wilson", "5555555555")
        val m6 = model(R.drawable.user, "Sarah Taylor", "6666666666")
        val m7 = model(R.drawable.user, "David Brown", "7777777777")
        val m8 = model(R.drawable.user, "Laura Clark", "8888888888")
        val m9 = model(R.drawable.user, "James White", "9999999999")
        val m10 = model(R.drawable.user, "Olivia Harris", "1010101010")
        val m11 = model(R.drawable.user, "Daniel Martin", "1212121212")
        val m12 = model(R.drawable.user, "Sophia Lewis", "1313131313")
        val m13 = model(R.drawable.user, "Matthew Walker", "1414141414")
        val m14 = model(R.drawable.user, "Emma Hall", "1515151515")
        val m15 = model(R.drawable.user, "Anthony Allen", "1616161616")
        val m16 = model(R.drawable.user, "Grace Young", "1717171717")
        val m17 = model(R.drawable.user, "Ethan King", "1818181818")
        val m18 = model(R.drawable.user, "Chloe Scott", "1919191919")

         data.add(m1)
         data.add(m2)
         data.add(m3)
         data.add(m4)
         data.add(m5)
         data.add(m6)
         data.add(m7)
         data.add(m8)
         data.add(m9)
         data.add(m10)
         data.add(m11)
         data.add(m12)
         data.add(m13)
         data.add(m14)
         data.add(m15)
         data.add(m16)
         data.add(m17)
         data.add(m18)


        val adapter = Adpt(data)
        recyclerView.adapter = adapter


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


