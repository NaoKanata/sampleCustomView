package com.naokanata.samplecustomview

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private fun dp(context : Context, value :Int):Float{
        return value * context.resources.displayMetrics.density
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        for(i in 0..10){
            var mycustomview = MyCustomView(this)
            var lp = LayoutParams(LayoutParams.MATCH_PARENT,100)
            mycustomview.layoutParams = lp
            mycustomview.setBackgroundColor(Color.rgb(1f,1f,i/10f))
            mainLinearLayout.addView(mycustomview)
        }


    }
}
