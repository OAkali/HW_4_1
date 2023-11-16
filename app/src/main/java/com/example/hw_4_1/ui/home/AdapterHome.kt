package com.example.hw_4_1.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_4_1.databinding.ItemHomeBinding

class AdapterHome(private var list: List<HomList>):RecyclerView.Adapter<AdapterHome.Holder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(ItemHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list[position])
    }
    inner class Holder(private var binding:ItemHomeBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(hom:HomList){
            binding.apply {

                    hom.apply {

Glide.with(ivphoto).load(photo).into(ivphoto)
                        tvname.text=name
                        tvTheme.text=theme


                    }


            }

        }
    }
}