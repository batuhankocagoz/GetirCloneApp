package com.batuhankocagoz.getircloneapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.batuhankocagoz.getircloneapp.R
import com.batuhankocagoz.getircloneapp.data.entity.Campaign
import com.batuhankocagoz.getircloneapp.data.entity.Category
import com.batuhankocagoz.getircloneapp.databinding.FragmentHomeBinding
import com.batuhankocagoz.getircloneapp.ui.adapter.CampaignAdapter
import com.batuhankocagoz.getircloneapp.ui.adapter.CategoryAdapter

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.recyclerViewCampaign.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewCategory.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val campaignList = ArrayList<Campaign>()
        val cm1 = Campaign(1,"kampanya_bir")
        val cm2 = Campaign(2,"kampanya_iki")
        val cm3 = Campaign(3,"kampanya_uc")
        val cm4 = Campaign(4,"kampanya_dort")
        val cm5 = Campaign(5,"kampanya_bes")

        campaignList.add(cm1)
        campaignList.add(cm2)
        campaignList.add(cm3)
        campaignList.add(cm4)
        campaignList.add(cm5)

        val campaignAdapter = CampaignAdapter(requireContext(),campaignList)
        binding.recyclerViewCampaign.adapter = campaignAdapter

        val categoryList = ArrayList<Category>()
        val ct1 = Category(1, "Süper İkili", "super_ikili")
        val ct2 = Category(2, "Kazandıranlar", "kazandiranlar")
        val ct3 = Category(3, "İndirimler", "indirimler")
        val ct4 = Category(4, "Yeni Ürünler", "yeni_urunler")
        val ct5 = Category(5, "Su & İçecek", "su_icecek")
        val ct6 = Category(6, "Meyve & Sebze", "meyve_sebze")
        val ct7 = Category(7, "Süt Ürünleri", "sut_urunleri")
        val ct8 = Category(8, "Fırından", "firindan")
        val ct9 = Category(9, "Atıştırmalık", "atistirmalik")
        val ct10 = Category(10, "Dondurma", "dondurma")
        val ct11 = Category(11, "Temel Gıda", "temel_gida")
        val ct12 = Category(12, "Kahvaltılık", "kahvaltilik")
        val ct13 = Category(13, "Yiyecek", "yiyecek")
        val ct14 = Category(14, "Fit & Form", "fit_form")
        val ct15 = Category(15, "Kişisel Bakım", "kisisel_bakim")
        val ct16 = Category(16, "Ev Bakım", "ev_bakim")
        val ct17 = Category(17, "Ev Yaşam", "ev_yasam")
        val ct18 = Category(19, "Evcil Hayvan", "evcil_hayvan")
        val ct19 = Category(20, "Bebek", "bebek")
        val ct20 = Category(21, "Cinsel Sağlık", "cinsel_saglik")

        categoryList.add(ct1)
        categoryList.add(ct2)
        categoryList.add(ct3)
        categoryList.add(ct4)
        categoryList.add(ct5)
        categoryList.add(ct6)
        categoryList.add(ct7)
        categoryList.add(ct8)
        categoryList.add(ct9)
        categoryList.add(ct10)
        categoryList.add(ct11)
        categoryList.add(ct12)
        categoryList.add(ct13)
        categoryList.add(ct14)
        categoryList.add(ct15)
        categoryList.add(ct16)
        categoryList.add(ct17)
        categoryList.add(ct18)
        categoryList.add(ct19)
        categoryList.add(ct20)

        val categoryAdapter = CategoryAdapter(requireContext(),categoryList)
        binding.recyclerViewCategory.adapter = categoryAdapter

        val address = ArrayList<String>()
        address.add("Ev, İnönü, 4138 Sk., 24A, Menemen")
        address.add("Ev, Değirmenönü, 1 Sk., Pamukkale")
        address.add("Ev, Kuşpınar, 2 Sk., Merkezefendi")

        val arrayAdapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,address)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)



        return binding.root
    }
}