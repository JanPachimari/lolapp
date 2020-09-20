package com.pachimari.lolapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.champion_item.view.*


class ChampionAdapter(private val champions: List<Champion>) :
    RecyclerView.Adapter<ChampionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.champion_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = champions.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val champion = champions[position]
        holder.bind(champion)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(champion: Champion) {
            itemView.championSquare.setImageResource(champion.square)
            itemView.championName.text = champion.name
        }

    }
}