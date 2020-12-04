package com.example.lokersoloandronity.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lokersoloandronity.R
import com.example.lokersoloandronity.model.DataItem
import kotlinx.android.synthetic.main.item_list_loker.view.*

class LokerListAdapter (val context: Context, val dataLoker: List<DataItem>?):RecyclerView.Adapter<LokerListAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): LokerListAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_loker, parent,false))

    }

    override fun getItemCount(): Int = dataLoker?.count()!!

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataLoker!![position])
        holder.itemView.setOnClickListener{
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id",dataLoker?.get(position)?.id)

            intent.putExtra("tempatwisata",dataLoker?.get(position)?.tempatwisata)
            intent.putExtra("gambar",dataLoker?.get(position)?.gambar)
            intent.putExtra("deskripsi",dataLoker?.get(position)?.deskripsi)
            context.startActivity(intent)
        }

    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(loker: DataItem){
            itemView.tvTitle.text = loker?.posisi
            val imgUrl = "http://andronity.relaonline.biz.id/pariwisata/image/${loker.gambar}"
            Glide.with(itemView.context)
                .load(imgUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .centerCrop()
                .into(itemView.ivGambar)
            Log.d("ali",imgUrl)
        }

    }

}