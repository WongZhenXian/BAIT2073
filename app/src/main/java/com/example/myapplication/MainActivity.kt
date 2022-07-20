package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding


// class Students extends xx
class MainActivity : AppCompatActivity() {

    //int i
    //var i:int
    private lateinit var binding : ActivityMainBinding
    private lateinit var student :Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.btnSetValue.setOnClickListener(){
            student = Student("Ali", 20, "RSD")
            binding.myData = student
        }

        //todo:: display student info
        binding.btnDisplay.setOnClickListener(){
            student.programme = "RIS"

            binding.apply {
                invalidateAll()
            }
    }
}