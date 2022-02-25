package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
buGetAge.setOnClickListener{
    buttonClick()
}

    }
fun buttonClick(){
    val userDOB:Int = Integer.parseInt(etDOB.text.toString())
    val currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
    val userAgeInYears:Int = currentYear - userDOB
    val futureAge = userDOB - currentYear
    var showAge:String;
    if(userAgeInYears>=0){
        tvShowAge.text = "Your age is $userAgeInYears Years"
    } else{
        tvShowAge.text = "You will be born in $futureAge years"
    }


}
}