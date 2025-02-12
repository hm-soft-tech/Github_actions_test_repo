package com.example.mks.github_actions_with_test

import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class UtilsTest {
    lateinit var test:Utils

    @org.junit.jupiter.api.BeforeEach
    fun setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }

    @Test
    fun checksum(){
        test  = Utils()
        val result =  test.addition(2,7)
       Assert.assertFalse(result)

    // Assert.assertEquals(true,true)


    }



}