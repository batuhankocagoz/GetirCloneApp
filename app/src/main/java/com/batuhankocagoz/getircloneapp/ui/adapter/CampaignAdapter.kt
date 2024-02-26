package com.batuhankocagoz.getircloneapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.batuhankocagoz.getircloneapp.data.entity.Campaign
import com.batuhankocagoz.getircloneapp.data.entity.Category
import com.batuhankocagoz.getircloneapp.databinding.CardCampaignBinding

class CampaignAdapter (var mContext: Context, var campaignList: List<Campaign>) : RecyclerView.Adapter<CampaignAdapter.CardCampaignHolder>(){

    inner class CardCampaignHolder(var design:CardCampaignBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardCampaignHolder {
        val binding = CardCampaignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardCampaignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardCampaignHolder, position: Int) {
        val campaign = campaignList.get(position)
        val itemBinding = holder.design

        itemBinding.imageViewCampaign.setImageResource(mContext.resources.getIdentifier(campaign.campaign_image,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return campaignList.size
    }
}