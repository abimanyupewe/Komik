package com.example.project_perpus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.project_perpus.databinding.ActivityDaftarBinding
import com.example.project_perpus.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_daftar.*
import kotlinx.android.synthetic.main.activity_login.*

class Daftar : AppCompatActivity() {

    private lateinit var binding: ActivityDaftarBinding
//    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDaftarBinding.inflate(layoutInflater)

        setContentView(binding.root)
        supportActionBar?.hide()

//        firebaseAuth = FirebaseAuth.getInstance()

        txtBackMasukListener()

        binding.btnDaftar.setOnClickListener {
            val username = ""
            val emai = ""
            val password = ""

            if (username.equals(username) && emai.equals(emai) && password.equals(password)) {
                val intent = Intent(this, Katalog::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this , it.toString() , Toast.LENGTH_SHORT).show()
            }
        }

//        binding.btnDaftar.setOnClickListener {
//            val username = binding.username.text.toString()
//            val email = binding.email.text.toString()
//            val password = binding.password.text.toString()
//            val enterpassword = binding.enterPassword.text.toString()
//
//            if (username.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && enterpassword.isNotEmpty()){
//                if (password == enterpassword){
//
//                    firebaseAuth.createUserWithEmailAndPassword(email , password).addOnCompleteListener {
//                        if (it.isSuccessful){
//                            val intent = Intent(this , Katalog::class.java)
//                            startActivity(intent)
//
//                        }else{
//                            Toast.makeText(this , it.exception.toString() , Toast.LENGTH_SHORT).show()
//                        }
//                    }
//
//                }else{
//                    Toast.makeText(this , "Password is not matching", Toast.LENGTH_SHORT).show()
//                }
//            }else{
//                Toast.makeText(this , "Empty Fields are not allowed !!", Toast.LENGTH_SHORT).show()
//            }
//        }
    }

    private fun txtBackMasukListener(){
        masuk.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}