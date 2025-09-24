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


        val m1 = model(R.drawable.user, "Farjad", "03194814728")
        val m2 = model(R.drawable.user, "Shayan", "03194814728")
        val m3 = model(R.drawable.user, "Asawer", "03194814728")
        val m4 = model(R.drawable.user, "Aleem", "03194814728")
        val m5 = model(R.drawable.user, "Aayan", "03194814728")
        val m6 = model(R.drawable.user, "Fatima", "03194814728")
        val m7 = model(R.drawable.user, "Ayesha", "03194814728")
        val m8 = model(R.drawable.user, "Ahmed", "03194814728")
        val m9 = model(R.drawable.user, "Ali", "03194814728")
        val m10 = model(R.drawable.user, "Awais", "03194814728")
        val m11 = model(R.drawable.user, "Mona", "03194814728")
        val m12 = model(R.drawable.user, "Fariha", "03194814728")
        val m13 = model(R.drawable.user, "Umair", "03194814728")
        val m14 = model(R.drawable.user, "Arsalan", "03194814728")
        val m15 = model(R.drawable.user, "Ayaz", "03194814728")
        val m16 = model(R.drawable.user, "Fayaz", "03194814728")
        val m17 = model(R.drawable.user, "Faris", "03194814728")
        val m18 = model(R.drawable.user, "Usman", "03194814728")


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


