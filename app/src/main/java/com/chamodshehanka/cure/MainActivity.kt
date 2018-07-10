package com.chamodshehanka.cure

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {

    var userEmail = null
    var userPassword = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun emailLogin(userEmail: ContactsContract.CommonDataKinds.Email, userPasswordAuthentication: PasswordAuthentication) {

    }
}