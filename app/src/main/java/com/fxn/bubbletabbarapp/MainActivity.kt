package com.fxn.bubbletabbarapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.fxn.bubbletabbarapp.utils.isDarkThemeOn
import com.fxn.bubbletabbarapp.utils.setUpStatusNavigationBarColors


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setUpStatusNavigationBarColors(
            isDarkThemeOn(),
            ContextCompat.getColor(this, R.color.background)
        )
        setContentView(R.layout.activity_main)
    }


}
