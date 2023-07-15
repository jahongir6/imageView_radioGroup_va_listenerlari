package com.example.imageviewvahk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bu checkBoxni orqa tarafi uning ichiga hohlaganingni yozorasan
        // checkBox.isChecked checkbox bosildimi yomi bilish uchun ischeckeddan foydalansayiz boladi
        /*checkBox.setOnCheckedChangeListener(object :CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Toast.makeText(this@MainActivity, "$isChecked", Toast.LENGTH_SHORT).show()
            }
        })*/
        // bu radiogroupniki rad_a bosilganda undan keyin ekran bosilsa true false
        // qilib aytadi siz ozgartirsayiz boladi
        /* root.setOnClickListener {
             val b = rad_a.isChecked
             Toast.makeText(this, b.toString(), Toast.LENGTH_SHORT).show()
         }*/

            // bu switchni listeneri
        /*switc.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (switc.isChecked == true) {
                    switc.text = "jahongir endi turdi"
                } else {
                    switc.text = "halixam yotibdi jahongir"
                }

            }
        })*/

    }
}