package com.example.mks.github_actions_with_test

import android.annotation.SuppressLint

class Utils {


  @SuppressLint("SuspiciousIndentation")
  fun addition(a:Int, b:Int):Boolean{
    val  sum  = a + b
      if (sum > 40)
      {
          return true
      }
      else{
          return false
      }

  }


}