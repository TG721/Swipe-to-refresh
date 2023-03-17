package com.tengizmkcorp.swipe_to_refresh

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tengizmkcorp.swipe_to_refresh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()
    }

    private fun setup() {
        val linearLayoutManager = LinearLayoutManager(this)
        rvAdapter = RVAdapter(fruits)
        binding.RV.layoutManager = linearLayoutManager
        binding.RV.adapter = rvAdapter

        val swipeLayout = binding.swipeRefreshLayout
        swipeLayout.setProgressBackgroundColorSchemeColor(Color.BLUE)
        swipeLayout.setColorSchemeColors(Color.RED)
        swipeLayout.setOnRefreshListener {
            fruits.clear()
            fruits.addAll(0,updatedFruits)
            rvAdapter.notifyDataSetChanged()
            swipeLayout.isRefreshing = false

        }
    }
}