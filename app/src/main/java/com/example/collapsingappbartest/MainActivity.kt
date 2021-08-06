package com.example.collapsingappbartest

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.CollapsingToolbarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolBar = findViewById<Toolbar>(R.id.toolbar)
        val collapsingToolBarLayout =
            findViewById<CollapsingToolbarLayout>(R.id.collapsingToolBarLayout)
        setSupportActionBar(toolBar)
        collapsingToolBarLayout.apply {
            setCollapsedTitleTextColor(Color.WHITE)
            setExpandedTitleColor(Color.WHITE)

        }
    }
}