package com.example.lesson7dz

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson7dz.databinding.ItemPictureBinding

class PictureAdapter(
    private val pictureList: List<Picture>,
    private val onClick: (Picture) -> Unit
) :
    RecyclerView.Adapter<PictureAdapter.PictureViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder {
        return PictureViewHolder(
            ItemPictureBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {
        holder.bind(pictureList[position])
    }

    override fun getItemCount(): Int {
        return pictureList.size
    }

    inner class PictureViewHolder(private val binding: ItemPictureBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(picture: Picture) = with(binding) {
            pictureFirst.setImageResource(picture.image)
            text.text = picture.text
            name.text = picture.name
        }

        init {
            itemView.setOnClickListener {
                onClick(pictureList[adapterPosition])
            }
        }
    }
}