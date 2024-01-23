package com.example.project_perpus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.project_perpus.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
        supportActionBar?.hide()


        binding.btnLogin.setOnClickListener {
            val username = ""
            val password = ""

            if (username.equals(username) && password.equals(password)) {
                val intent = Intent(this, Katalog::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this , it.toString() , Toast.LENGTH_SHORT).show()
            }
        }

        firebaseAuth = FirebaseAuth.getInstance()
        binding.btnLogin.setOnClickListener {
            val usernameemail = binding.usernameemail.text.toString()
            val password = binding.password.text.toString()

            if (usernameemail.isNotEmpty() && password.isNotEmpty()){

                    firebaseAuth.signInWithEmailAndPassword(usernameemail , password).addOnCompleteListener {
                        if (it.isSuccessful){
                            val intent = Intent(this , Katalog::class.java)
                            startActivity(intent)

                        }else{
                            Toast.makeText(this , it.exception.toString() , Toast.LENGTH_SHORT).show()
                        }
                    }
            }else{
                Toast.makeText(this , "Empty Fields are not allowed !!", Toast.LENGTH_SHORT).show()
            }
        }
        btnLoginListener()
        txtDaftarListener()
        txtLupaPassword()
    }

    //pindah halaman
    private fun btnLoginListener() {
        btn_login.setOnClickListener {
            startActivity(Intent(this, Katalog::class.java))
        }
    }

    private fun txtDaftarListener() {
        daftar.setOnClickListener {
            startActivity(Intent(this, Daftar::class.java))
        }
    }

    private fun txtLupaPassword() {
        lupa_password.setOnClickListener {
            startActivity(Intent(this, LupaPassword::class.java))
        }
    }
}