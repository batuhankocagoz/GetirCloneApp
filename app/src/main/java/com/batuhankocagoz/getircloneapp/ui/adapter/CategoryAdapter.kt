package com.batuhankocagoz.getircloneapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.batuhankocagoz.getircloneapp.data.entity.Category
import com.batuhankocagoz.getircloneapp.databinding.CardCategoriesBinding

class CategoryAdapter(var mContext: Context, var categoryList: List<Category>)
    : RecyclerView.Adapter<CategoryAdapter.CardCategoryHolder>(){

    inner class CardCategoryHolder(var design : CardCategoriesBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardCategoryHolder {
        val binding = CardCategoriesBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardCategoryHolder(binding)
    }

    override fun onBindViewHolder(holder: CardCategoryHolder, position: Int) {
        val category = categoryList.get(position)
        val itemBinding = holder.design

        itemBinding.textViewCategoryName.text = category.category_name
        itemBinding.imageViewCategory.setImageResource(mContext.resources.getIdentifier(category.category_image,"drawable",mContext.packageName))

    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}