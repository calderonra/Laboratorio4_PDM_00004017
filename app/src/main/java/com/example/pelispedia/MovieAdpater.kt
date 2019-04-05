package com.example.pelispedia

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View

class MovieAdpater(var movies: List<Movie>):RecyclerView.Adapter<MovieAdpater.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MovieAdpater.ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.cardview_movie,p0,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(p0: MovieAdpater.ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    fun bind(item)
}

}