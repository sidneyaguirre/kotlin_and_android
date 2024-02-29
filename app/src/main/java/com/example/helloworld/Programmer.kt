package com.example.helloworld

enum class Language {
  DART, KOTLIN, PYTHON
}

//class Programmer(val name: String, var age: Int, val technologies: Array<String>) {
class Programmer(
  val name: String,
  var age: Int,
  val technologies: Array<Language>,
  //var friends: Array<Programmer>?, // mandatory parameter
  var friends: Array<Programmer>? = null, // not mandatory parameter

) {
  fun code() {
    for (language in technologies) {
      println("I'm programming in $language")
    }
  }
}