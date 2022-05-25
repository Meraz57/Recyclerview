package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val List: List<Mydata>) : RecyclerView.Adapter<Adapter.Myviewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_recycler, parent, false)
        return Myviewholder(view)


    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        val item = List[position]
        holder.image.setImageResource(item.image)
        holder.textView.text = item.text

    }

    override fun getItemCount(): Int {
        return List.size

    }



    class Myviewholder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.imageview)
        val textView = view.findViewById<TextView>(R.id.textview)

    }
}