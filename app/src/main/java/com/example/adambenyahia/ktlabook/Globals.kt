package com.example.adambenyahia.ktlabook

import android.graphics.Bitmap

class Globals {

    companion object Chosen {
        var chosenImage: Bitmap? = null
        fun  returnimage():Bitmap{
            return chosenImage!!
        }
    }
}