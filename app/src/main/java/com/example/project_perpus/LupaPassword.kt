package com.example.project_perpus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_lupa_password.*

class LupaPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_password)

        btnUbahPassword()
    }

    private fun btnUbahPassword(){
        btn_ubah_password.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}