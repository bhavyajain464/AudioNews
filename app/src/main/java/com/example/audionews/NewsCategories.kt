package com.example.audionews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.content.Intent
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
//import com.example.audionews.CategoryNews
import com.example.audionews.R
import com.example.audionews.categoriesAdapter


class NewsCategories : Fragment() {
    lateinit var gridView: GridView
    private var playerNames = arrayOf("Technology", "Sports", "Entertainment", "Business", "Miscellaneous", "Science", "Health", "India")
    private var playerImages = intArrayOf(
        R.drawable.technology,
        R.drawable.sports,
        R.drawable.entertainment,
        R.drawable.business,
        R.drawable.general,
        R.drawable.science,
        R.drawable.health,
        R.drawable.india
    )
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_news_categories, container, false)
        gridView = view.findViewById(R.id.gridView)
        val Adapter = categoriesAdapter(view.context,playerNames,playerImages)
        gridView.adapter = Adapter
        gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                activity, "You CLicked " + playerNames[+position],
                Toast.LENGTH_SHORT
            ).show()
//            val intent = Intent(activity, CategoryNews::class.java)
//            val url = "https://newsapi.org/v2/top-headlines?country=in&category="+playerNames[+position]+"&apiKey=0f640fd6cd8c4624b2b77249d8fa21bb"
//            intent.putExtra(CategoryNews.url,url)
//            startActivity(intent)

        }
        return view
    }


}