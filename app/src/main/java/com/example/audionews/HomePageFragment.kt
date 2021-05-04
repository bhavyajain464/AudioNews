package com.example.audionews

import OnSwipeTouchListener
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.core.view.MotionEventCompat
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class HomePageFragment : Fragment(R.layout.fragment_homepage){
    private lateinit var layout: RelativeLayout
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_news_categories, container, false)
        layout = view.findViewById(R.id.fragment_container_news)
        layout.setOnTouchListener(object : OnSwipeTouchListener(activity) {
            override fun onSwipeLeft() {
                super.onSwipeLeft()
                val action =
                    SpecifyAmountFragmentDirections
                        .actionSpecifyAmountFragmentToConfirmationFragment()
                view.findNavController().navigate(action)

            }
        })
        return view
    }


}
