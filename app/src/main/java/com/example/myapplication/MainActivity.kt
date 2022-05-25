package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var data:List<Mydata>
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val recyclerView=findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val data=ArrayList<Mydata>()
        for (i in 1..20){
            data.add(Mydata(R.drawable.ic_launcher_background,"Image no $i"))
        }
        val adapter=Adapter(data)
        recyclerView.adapter=adapter




    }


}