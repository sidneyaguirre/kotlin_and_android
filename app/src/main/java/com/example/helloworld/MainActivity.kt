package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    //variablesAndConstants()

    //dataTypes()

    //collections()

    //bucles()

    //validations()

    //nullSafety()

    //functions()

    classes()
  }

  private fun variablesAndConstants() {
    // variables
    var helloWorld = "Hello World!"
    println(helloWorld)

    helloWorld = "Hello Team!"
    println(helloWorld)


    // constants
    val myNumber = 1
    println(myNumber)

    val myConstant = "Hello Sid!"
    println(myConstant)
  }

  private fun dataTypes() {
    // String
    val myString: String = "hello String"
    val myString2: String = "Value 2"
    val myString3 = myString + myString2

    println(myString3)

    // Integers (Byte, Short, Int, Long)
    val myInt: Int = 1
    val myInt2 = 2
    val myInt3 = myInt + myInt2

    println(myInt3)

    // Double (Float, Double)
    val myFloat: Float = 1.5f
    val myDouble: Double = 1.5
    val myDouble2 = 1

    val myDouble3 = myDouble + myDouble2
    println(myDouble3)

    //Boolean
    val myBool = true
    val myBool2 = false

    println(myBool == myBool2)
  }

  private fun collections() {

    // Array
    val name = "Sidney"
    val surname = "Aguirre"
    val age = "30"

    val myArray = arrayListOf<String>()
    myArray.add(name)
    myArray.add(surname)
    myArray.add(age)
    myArray.add(name) // Allows repeated elements

    println("with duplicates $myArray")

    // Map
    var myMap: Map<String, Int> = mapOf() // immutable
    myMap = mapOf("Sid" to 1, "Aguirre" to 2, "age" to 3)

    println(myMap) //{Sid=1, Aguirre=2, age=3}

    var newMap = mutableMapOf<String, Int>()
    // Add a value
    newMap["Ana"] = 2
    newMap.put("Marcos", 2)

    println(newMap)
  }

  private fun bucles() {
    val myNumber = 10

    var num = 1

    // While
    while (num <= myNumber) {
      println(num)
      num++
    }

    val myArray = listOf("Dahlia", "Lena", "Pepa")
    val myMap = mutableMapOf("Sid" to 1, "John" to 2)

    // For
    for (myString in myArray) {
      println(myString)
    }

    for (myElement in myMap) {
      println("${myElement.key} - ${myElement.value}")
    }

    // 0 included and 10 included
    for (index in 1..10) {
      println(index)
    }

    // 0 included, 10 excluded
    for (index in 1 until 10) {
      println(index)
    }

    // increments in 2
    for (index in 1..10 step 2) {
      println(index)
    }

    // countdown
    for (index in 10 downTo 0) {
      println(index)
    }
  }

  private fun validations() {
    val myNumber = 10

    val num = 1

    // If
    if (num <= myNumber) {
      println("$num is <= than $myNumber")
    }

    // When
    // (known as [Switch] in other programming languages)
    val country = "Colombia"
    when (country) {
      // I can concatenate cases in one condition
      "Colombia", "Ecuador", "Peru" -> {
        println("The language is Spanish")
      }

      "USA" -> {
        println("The language is English")
      }

      else -> {
        println("No Country")
      }
    }

    val age = 10
    when (age) {
      // I can concatenate cases in one condition
      0, 1, 2 -> {
        println("Baby")
      }

      // Use Range
      in 3..10 -> {
        println("Child")
      }

      in 11..17 -> {
        println("Teenager")
      }

      in 18..40 -> {
        println("Young")
      }

      in 41..59 -> {
        println("Adult")
      }

      in 60..99 -> {
        println("Elder")
      }

      else -> {
        println("😱")
      }
    }
  }

  fun nullSafety() {
    var myString = "Sidney"
    //myString = null this will throw null exception

    var myNullableString: String? = "Sidney"
    println(myNullableString)

    myNullableString = null
    println(myNullableString)

    myNullableString = "Aguirre"
    println(myNullableString)

    /*if(myNullableString != null){
      println(myNullableString!!)
    } else {
      println(myNullableString)
    }*/

    // Safe calls (when no using if to validate nullability)
    println(myNullableString?.length)

    // The code in brakets will be executed when myNullableString is not null
    myNullableString?.let {
      println(it) // [it] refers to myNullableString
    } ?: run {
      // [?: run] will be executed when myNullableString is null 
      println("myNullableString is null")
    }
  }

  private fun functions() {
    sayMyName("Sidney")
  }

  private fun sayMyName(name: String) {
    println("Hello, my name is $name")
  }

  fun add(first: Int, second: Int): Int {
    return first + second
  }

  fun classes() {
    //var sidProgrammer = Programmer("Sidney", 30, arrayOf("Kotlin", "Dart"))
    var sidProgrammer = Programmer(
      "Sidney",
      30,
      arrayOf(Language.KOTLIN, Language.DART),
      arrayOf(Programmer(name = "Sara", age = 20, technologies = arrayOf(Language.PYTHON)))
    )

    println(sidProgrammer.name)
    sidProgrammer.age = 31

    val saraProgrammer =
      Programmer("Sara", 20, arrayOf(Language.KOTLIN, Language.PYTHON), friends = arrayOf(sidProgrammer))
    saraProgrammer.code()

    println("${saraProgrammer.name} is friend with ${saraProgrammer.friends?.first()?.name}")
  }
}