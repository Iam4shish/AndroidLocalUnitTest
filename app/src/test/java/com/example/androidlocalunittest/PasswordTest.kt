package com.example.androidlocalunittest

import com.example.androidlocalunittest.utils.Utils
import junit.framework.TestCase.assertEquals
import org.junit.Test

class PasswordTest {
    @Test
    fun validatePassword_blankInput_expectedRequiredField(){
        val utils = Utils()
        val actualResult = utils.validatePassword(" ")
        assertEquals("Password cannot be blank", actualResult)
    }
    @Test
    fun validatePassword_3Char_expectedMinChar(){
        val utils = Utils()
        val actualResult = utils.validatePassword("ab")
        assertEquals("Password must be at least 6 characters long", actualResult)
    }
    @Test
    fun validatePassword_3Char_expectedLessThanMaxChar(){
        val utils = Utils()
        val actualResult = utils.validatePassword("abcdefghijk123456789")
        assertEquals("Password cannot exceed 15 characters", actualResult)
    }
    @Test
    fun validatePassword_CorrectInput_expectedValidPassword(){
        val utils = Utils()
        val actualResult = utils.validatePassword("abcdefg")
        assertEquals("Valid Password", actualResult)
    }
}