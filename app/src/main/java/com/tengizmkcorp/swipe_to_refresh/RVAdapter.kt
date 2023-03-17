package com.tengizmkcorp.swipe_to_refresh

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tengizmkcorp.swipe_to_refresh.databinding.RvItemBinding


class RVAdapter(
    private val items: MutableList<Fruit>,
) :
    RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {


    inner class ItemViewHolder(private val binding: RvItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Fruit) {
            val pos = adapterPosition
            binding.imageView.setImageResource(item.picture)
            binding.nameTV.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            RvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}