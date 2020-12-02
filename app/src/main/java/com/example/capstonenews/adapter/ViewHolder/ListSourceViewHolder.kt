package com.example.capstonenews.adapter.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.capstonenews.`interface`.ItemClickListener

class ListSourceViewHolder(itemView:View):RecyclerView.ViewHolder(itemView), View.OnClicklistener(

    private lateinit var itemclickListener:ItemClickListener

    var source_title = itemView.source_news_name

    fun setItemclickListener(itemClickListener: ItemClickListener)
    {
        this.itemClickListener = itemClickListener
    }

    override fun onClick(v: View?) {
        itemClickListener.onClick(v!!,adapterPosition)
    }
)