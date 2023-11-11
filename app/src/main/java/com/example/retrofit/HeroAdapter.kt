package com.example.retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofit.databinding.ItemMarvelBinding
import com.example.retrofit.model.Data
import com.example.retrofit.model.Hero

class HeroAdapter(private val listHero: List<Data>, ):
    RecyclerView.Adapter<HeroAdapter.ItemSuperheroViewHolder>(){
    inner class ItemSuperheroViewHolder (private val binding: ItemMarvelBinding):RecyclerView.ViewHolder(binding.root) {
        val itemImage: ImageView = itemView.findViewById(R.id.img_hero)
        fun bind(data: Data) {
            with(binding) {
                title.text = data.heroName
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ItemSuperheroViewHolder {
        val binding =
            ItemMarvelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemSuperheroViewHolder(binding)
    }

    override fun getItemCount(): Int = listHero.size

    override fun onBindViewHolder(holder: ItemSuperheroViewHolder, position: Int) {
        holder.bind(listHero[position])
        Glide.with(holder.itemView.context)
            .load(listHero[position].heroImage)
            .centerCrop()
            .into(holder.itemImage)
    }
}