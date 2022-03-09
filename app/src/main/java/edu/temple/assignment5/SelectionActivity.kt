package edu.temple.assignment5

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        val dogNames = resources.getStringArray(R.array.dog_names)
        val descriptions = resources.getStringArray(R.array.descriptions)

        val images = arrayOf(
            R.drawable.bulldog,
            R.drawable.dalmation,
            R.drawable.doberman,
            R.drawable.german_sheperd,
            R.drawable.golden_retriever,
            R.drawable.pug,
            R.drawable.rottweiler,
            R.drawable.saint_bernard,
            R.drawable.shih_tzu,
            R.drawable.yellow_lab,
        )



        val numColumns = 2
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = RecyclerViewAdapter(this, images, dogNames, descriptions)
        recyclerView.adapter = adapter
    }
}