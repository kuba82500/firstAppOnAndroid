package com.example.loginverifiction

class LoginVerification {
    fun verify(email: String, password: String): Boolean {
        return email == "test@gmail.com" && password == "password"

    }
}