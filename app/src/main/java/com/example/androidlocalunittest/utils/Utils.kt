package com.example.androidlocalunittest.utils

class Utils {
    fun validatePassword(input: String) = when{
        input.isBlank() ->{
            "Password cannot be blank"
        }
        input.length < 6 ->{
            "Password must be at least 6 characters long"
        }
        input.length > 15 ->{
            "Password cannot exceed 15 characters"
        }
        else ->{
            "Valid Password"
        }
    }
}