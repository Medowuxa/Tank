package com.example.battletanks

import android.app.Activity
import android.content.Context
import android.content.Context.MODE_PRIVATE
import com.example.battletanks.models.Element

class LevelStorage(val context: Context) {
    private val pref = (context as Activity).getPreferences(MODE_PRIVATE)
    fun saveLevel(elementsOnContainer: List <Element>){

    }

    fun loadLevel(){

    }
}