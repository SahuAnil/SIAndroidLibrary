package com.example.silibrary

import android.content.Context
import android.widget.Toast

class SIUtil {

    companion object {

        fun showToast(context : Context,message : String){
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }
    }
}