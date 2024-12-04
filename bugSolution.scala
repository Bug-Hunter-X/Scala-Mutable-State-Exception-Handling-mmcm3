```scala
case class MyClass(name: String, var value: Int) {
  require(value >= 0, "Value cannot be negative")
}

object Main extends App {
  val myObject = MyClass("MyObject", 10)
  println(myObject.value) // Output: 10

  //Using a try-catch block is less necessary here, as the constructor ensures valid values

  //Demonstrating immutability through a copy method
  val updatedObject = myObject.copy(value = 15)
  println(updatedObject.value) // Output: 15 
  println(myObject.value) // Output: 10
}
```