package com.omerakkoyun.toastor

import android.content.Context
import android.widget.Toast

/**
 * Created by Omer AKKOYUN on 4.07.2023.
 */
class Toasttt {
    companion object{


        fun toast1(context: Context, message:String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }


    }
}