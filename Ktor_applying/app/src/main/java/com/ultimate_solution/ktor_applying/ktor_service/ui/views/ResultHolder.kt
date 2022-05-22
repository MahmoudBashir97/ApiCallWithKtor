package com.ultimate_solution.ktor_applying.ktor_service.ui.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ultimate_solution.ktor_applying.databinding.ViewItemListBinding

class ResultHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val bd:ViewItemListBinding = ViewItemListBinding.bind(itemView)

    public fun bind(name:String){
        bd.text.text = name
    }
}