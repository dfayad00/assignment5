package edu.temple.assignment5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class RecyclerViewAdapter(val context: Context, private val images: Array<Int>, private val dogNames: Array<String>, private val descriptions: Array<String>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView = view.findViewById(R.id.name)
        val textViewDescription: TextView = view.findViewById(R.id.description)
        var imageView: ImageView = view.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.row_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.textViewName.text = dogNames[position]
        viewHolder.textViewDescription.text = descriptions[position]
        viewHolder.imageView.setImageResource(images[position])
    }

    override fun getItemCount() = images.size

}