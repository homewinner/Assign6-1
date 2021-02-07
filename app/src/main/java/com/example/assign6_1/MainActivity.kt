package com.example.assign6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miss = Toast.makeText(applicationContext,"Some field is blank.",Toast.LENGTH_LONG)
        val num2 = Toast.makeText(applicationContext,"Num 2 Shouldn't be blank or be 0.",Toast.LENGTH_LONG)
        val clear = Toast.makeText(applicationContext,"All fields are cleared.",Toast.LENGTH_LONG)
//        val a = MainNum.getText().toString().toDouble()
//        val b = SubNum.getText().toString().toDouble()  //ถ้าใส่ตรงนี้แอพจะเด้งเนื่องจากไม่สามรถ get ค่า Main , sub ได้(มั้ง)
        var res:Double

        bplus.setOnClickListener(){
            if (this.MainNum.text.toString() == "" || this.SubNum.text.toString() == ""){
                miss.show()
            }else{
                val a = MainNum.getText().toString().toDouble()
                val b = SubNum.getText().toString().toDouble()
                Sym.setText("+")
                res = a + b
                Sum.setText("$res")
            }
        }
        bmin.setOnClickListener(){
            if (this.MainNum.text.toString() == "" || this.SubNum.text.toString() == ""){
                miss.show()
            }else{
                val a = MainNum.getText().toString().toDouble()
                val b = SubNum.getText().toString().toDouble()
                Sym.setText("-")
                res = a - b
                Sum.setText("$res")
            }
        }
        bmul.setOnClickListener(){
            if (this.MainNum.text.toString() == "" || this.SubNum.text.toString() == ""){
                miss.show()
            }else{
                val a = MainNum.getText().toString().toDouble()
                val b = SubNum.getText().toString().toDouble()
                Sym.setText("*")
                res = a * b
                Sum.setText("$res")
            }
        }
        bdiv.setOnClickListener(){
            if (this.MainNum.text.toString() == "" || this.SubNum.text.toString() == ""){
                miss.show()
            }else{
                val a = MainNum.getText().toString().toDouble()
                val b = SubNum.getText().toString().toDouble()
                Sym.setText("/")
                res = a / b
                Sum.setText("$res")
            }
        }
        bmod.setOnClickListener(){
            if (this.SubNum.text.toString() == "" || this.SubNum.text.toString() == "0"){
                num2.show()
            }else{
                val a = MainNum.getText().toString().toDouble()
                val b = SubNum.getText().toString().toDouble()
                Sym.setText("%")
                res = a % b
                Sum.setText("$res")
            }
        }
        bclear.setOnClickListener(){
            MainNum.setText(null)
            SubNum.setText(null)
            Sum.setText(null)
            Sym.setText(null)
            clear.show()
        }
    }
}
