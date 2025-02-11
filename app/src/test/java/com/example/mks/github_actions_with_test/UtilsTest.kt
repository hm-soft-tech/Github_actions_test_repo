package com.example.mks.github_actions_with_test

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class UtilsTest {
    lateinit var test:Utils

    @Before
    fun setUp() {
        test  = Utils()
    }

   @After
    fun tearDown() {
    }

    @Test
    fun checksum(){
    val result =  test.addition(2,7)
     Assert.assertFalse(result)
   }
    @Test
    fun checksub(){
    val result =  test.subtraction(19,45)
     Assert.assertFalse(result)
   }



}