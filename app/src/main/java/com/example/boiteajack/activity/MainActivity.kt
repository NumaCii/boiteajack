package com.example.boiteajack.activity

import com.example.boiteajack.adapter.SoundAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.boiteajack.R
import com.example.boiteajack.dialog.ButtonDialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.sounds_list)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = SoundAdapter(this)

        val button = findViewById<View>(R.id.add_button)
        button.setOnClickListener{
            ButtonDialogFragment(this).show(supportFragmentManager,null)
        }

    }


}