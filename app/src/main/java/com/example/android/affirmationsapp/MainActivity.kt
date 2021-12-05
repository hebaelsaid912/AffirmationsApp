package com.example.android.affirmationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.affirmationsapp.affirmations_data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)


    }
}