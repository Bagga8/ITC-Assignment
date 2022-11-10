import java.util.Date
import Array._
package Inheritance{}

object Main {
  def main(args: Array[String]): Unit = {

    /*trait Shape {
      def color: String; //abstract method
    }

    abstract class Polygon {
      def area: Double;
    }
    object AbstractPolygon {
      def printAreaPolygon(p: Polygon): Unit = {
        println(p.area)
      }
    }

    class Rectangle(var width: Double, var height: Double)
      extends Polygon with Shape {
      override def area: Double = width * height
      override def color: String = "Pink";
    }
    var rect = new Rectangle(55.2, 20.0);
    println(rect.area)
    println(rect.color)

    class Triangle(var width: Double, var height: Double)
      extends Polygon with Shape {
      override def area: Double = width * height
      override def color: String = "Blue";
    }

    var tri = new Triangle(55.2, 20.0);
    println(tri.area)
    println(tri.color)*/


    /*lazy val l = 9
    println(l) //not assigned to l until its being used

    class strict {
      val e = {
        println("Strict");
        9
      }
    }

    class LazyEval {
      lazy val l = { //not assigned to l yet
        println("Lazy");
        9
      }
    }

    val x = new strict;
    val y = new LazyEval
    println(x.e)
    println(y.l)

    def method1(n: Int) {
      println("Method1")
      println(n)
    }

    def method2(n: => Int) {
      println("Method2")
      println(n)
    }

    val add = (a: Int, b: Int) => {
      println("Add")
      a + b
    }
    method1(add(5, 6))
    method2(add(5, 6))*/


    /*abstract class AbstractPolygon {
      def area: Double;
    };

    class AbstractRectangle(var width: Double, var height: Double) extends AbstractPolygon {
      override def area: Double = width * height;
    };
    class AbstractTriangle(var width: Double, var height: Double) extends AbstractPolygon {
      override def area: Double = width * height / 2;
    };

    def printAbstractArea(p: AbstractPolygon): Unit = {
      println(p.area)
    };

    var abstractRect = new AbstractRectangle(55.2, 20.0);
    printAbstractArea(abstractRect);
    var abstractTri = new AbstractTriangle(55.2, 20.0);
    printAbstractArea(abstractTri); */


    /*class Polygon {
      def area: Double = 0.0
    };
    class Rectangle(var width: Double, var height: Double) extends Polygon {
      override def area: Double = width * height;
    };
    class Triangle(var width: Double, var height: Double) extends Polygon {
      override def area: Double = width * height / 2;
    };

    def printArea(p: Polygon): Unit = {
      println(p.area)
    };

    var poly = new Polygon;
    printArea(poly);
    var rect = new Rectangle(55.2, 20.0);
    printArea(rect);
    var tri = new Triangle(55.2, 20.0);
    printArea(tri); */


    /*class User8(private var name: String, var age: Int) {
      def this() {
        this("Bagga", 25)
      }

      def this(name: String) {
        this("Bagga", 25)
      }
    };

      var user1 = new User8("Manpreet", 26) ;
      var user2 = new User8() ;
      var user3 = new User8("Manpreet") ;

      println(user1.age);*/


    /*class User(private var name: String, var age: Int) {
      def printName {println(name)
      }
    };

    var user = new User("Max", 28);
    user.printName
    println(user.age)*/


    /*val lst = List(1, 2, 3, 5, 7, 10, 13)
    val lst2 = List("A", "B", "C")
    println(lst.reduceLeft(_ + _))
    println(lst2.reduceLeft(_ + _))
    println(lst.reduceLeft((x, y) => {
      println(x + " , " + y); x + y
    }))

    println(lst.reduceLeft(_ - _))
    println(lst.reduceRight(_ - _))
    println(lst.reduceRight((x, y) => {
      println(x + " , " + y); x + y
    }))

    println(lst.foldLeft(100)(_ + _))
    println(lst2.foldLeft("z")(_ + _))

    println(lst.scanLeft(100)(_ + _))
    println(lst2.scanLeft("z")(_ + _))*/


    /*val lst = List(1, 2, 3)
    val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")
    println(lst.map(_ * 2))
    println(lst.map(x => x / 0.2))
    println(lst.map(x => "hi " + x))
    println(mymap.mapValues(x => "hi " + x))
    println("Hello".map(_.toUpper))
    println(List(List(1, 2, 3)), List(3, 4, 5))
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten)
    println(lst.flatMap(x => List(x, x + 1)))
    println(lst.filter(x => x % 2 == 0)) */


    /*val lst = List(1, 2, 3)
    val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")
    val opt: Option[Int] = Some(8)
    val opt2: Option[Int] = None
    println(lst.find(_ > 8))
    println(lst.find(_ > 8).getOrElse(0));
    println(map.get(5).getOrElse("No name found"))

    println(opt.isEmpty)*/


    /*val myTuple = (1, 2, "HELLO", true)
  val myTuple2 = new Tuple3(1, 2, "HeLLO");
  val myTuple3 = new Tuple3(1, "HeLLO", (2,3))

  def main(args: Array[String]){
  println(myTuple)
  println(myTuple._1)
  println(myTuple._2)
  println(myTuple._3)
  println(myTuple._4)

  myTuple.productIterator.foreach{
    i => println(i)
  }

  println(1 -> "TOm", true)
  println(myTuple3._3._2);*/


    /*val myMap: Map[Int, String] =
      Map(801 -> "Max", 802 -> "Tom", 804 -> "July");
    val myMap2: Map[Int, String] =
      Map( 805 -> "lua");

  def main(args: Array[String]) {
    println(myMap)
    println(myMap(801))
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    myMap.keys.foreach { key =>
      println("Key " + key)
      println("Value " + myMap(key))
    }
    println(myMap.contains(801000))
    println(myMap2 ++ myMap2)
    println(myMap)*/


    /*val myset: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 9)

    var mySet2: Set[Int] = Set(3, 5, 7, 1, 9, 3, 6, 8, 4)
    val names: Set[String] = Set("Max", "Tom", "John")

      println(myset + 10)
      println(names("Maxxxx"))
      println(myset.head)
      println(myset.tail)
      println(myset.isEmpty)

      println(myset ++ mySet2)
      println(myset.++(mySet2))

      println(myset.&(mySet2))
      println(myset.intersect(mySet2))
      println(myset.min)
      println(myset.max)
      myset.foreach(println)

      for (name <- names) {
        println(name)
      }*/


    /*val mylist: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val names: List[String] = List("Max", "Tom", "John")
    //mylist(0) = 5 this line would throw an error (this operation is not allowed)
    println(mylist)
    println(names)
    //append element to the beginning of the list
    println(0 :: mylist) //this just show an extra element, but it doesn't change the list (they're immutable ;)
    println(mylist)
    println(names)
    // whenever we use "Nil" at the end of the of an expression like: 1 :: 5 :: 7 :: Nil, that'd return a list
    println(1 :: 3 :: 5 :: Nil)
    println(mylist.head) //first element
    println(mylist.tail) //it shows all of the elements after the first one
    println(mylist)
    println(mylist.isEmpty) //is it empty
    println(mylist.reverse) // in reverse order
    println(List.fill(5)(2)) // to create a list with all of the lements same value
    println(mylist.max)
    mylist.foreach(println) // to print all of th element, eac on a different line

    var sum: Int = 0
    mylist.foreach(sum += _)
    println(sum)
    for (name <- names) {
      println(name)
    }
    println(names(0)) */


    /* val myarray: Array[Int] = new Array[Int](4);
    val myarray2 = new Array[Boolean](5);
    val myarray3 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9);
    myarray(0) = 20;
    myarray(1) = 30;
    myarray(2) = 40;
    myarray(3) = 50;
    println(myarray2.length);
    val result = concat(myarray, myarray3);
    myarray
    for (x <- result) {
      println(x)
    }
    for (i <- 0 to (myarray.length - 1)) {
      println(myarray(i));
    }*/


    /* val num1 = 75
  val num2 = 100.25
  val str1: String = "Hello World"
  val str2: String = "Max"
  def main(args: Array[String]) {
    println(str1.length())
    println(str1.concat(str2))
    println(str1 + str2)

    val result = printf("(%d -- %f -- %s)", num1, num2, str1)
    println(result)
    println("(%d -- %f -- %s)".format(num1, num2, str1))
    printf("(%d -- %f -- %s)\n", num1, num2, str1)
  }*/


    /*def add(x: Int, y:Int) = x + y

  def add2(x: Int) = (y: Int) => x + y;

  def add3(x: Int) (y: Int) = x + y;

  def main(args: Array[String]): Unit = {

    println(add(20, 10));
    println(add2(20)(10));
    val sum40 = add2(40);
    println(sum40(50));
    println(add3(100)(200))
    val sum50 = add3(50)_;
    println(sum50(400))*/


    /*var number = 10
  val add = (x: Int) => {
    x + number
  }
  def main(args: Array[String]): Unit = {
    println(add(20));
    println(number)
    } */


    /*def log(date : Date, message: String)= {
    println(date + " " + message)
  }

  def main(args: Array[String]): Unit ={
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, _: Int, _: Int)
    println(f(100, 200));

    val date = new Date;
    val newLog = log(date, _: String)
    newLog("The message 1")
    newLog("The message 2")
    newLog("The message 3")
    newLog("The message 4")
  }*/


    /* def math(x: Double, y: Double, z: Double, f: (Double,Double) =>Double): Double = f(f(x,y), z);
  def main(args: Array[String]): Unit = {
    val result = math(50, 20, 10, _ max _);
    println(math(50, 20, 10, (x, y) => x + y))
    println(math(50, 20, 10, (x, y) => x * y))
    println(math(50, 20, 10, (x, y) => x min y))
    println(math(50, 20, 10, (x, y) => x max y))
    println(math(50, 20, 10, _ + _))
    println(math(50, 20, 10, _ max _))*/


    /*object Math {
    def add(x: Int, y: Int): Int = x + y

    def subtract(x: Int, y: Int): Int = x - y;

    def multiply(x: Int, y: Int): Int = x * y;

    def divide(x: Int, y: Int): Int = x / y;

    def square(x: Int): Int = x*x;
  }

  def main(args: Array[String]): Unit = {

    println(Math.add(45, 15))
    println(Math.subtract(45, 15))
    println(Math.multiply(45, 15))
    println(Math.divide(45, 15))
    println(Math.square(8))
  }*/


    /*val age = 18;

    age match {
      case 20 => println(age)
      case 18 => println(age)
      case 24 => println(age)
      case 29 => println(age)
      case 21 => println(age)

      case _ => println("default");
    }

    val result = age match{
      case 20 => (age)
      case 18 => (age)
      case 24 => (age)
      case 29 => (age)
      case 21 => (age)

      case _ => "default";
    }

    println("result = "+result)

    val i = 8;
    i match {
      case 2|4|6|8|9 => println("even")
      case 1|3|5|7|9 => println("odd")
    } */


    /* for(i <- 1 to 5) {
      println("i using to " + i)
    }
    for (i <- 1 until 5) {
      println("i using until " + i)
    }
    for (i <- 1 to 5; j <- 3 to 8) {
      println("i using multiple ranges " + i + "j")
    }

    val lst = List(1, 2, 3, 4, 5, 6, 7, 8)

    for (i <- lst; if i < 6){
      println("i using filters " + i);
    } */


    /*var x=0;
    while (x <10) {
      println("x = " + x)
      x += 1; //x=x+1
    }
    var y=0
    do {
      println("y = " + y)
      y += 1
    } while (y <0) */


    /*  val x=12;
    val y=30;
    var res = "";

    if (x< 20 || y>30) {
      res = "x == 20 and y==30";
    } else {
      res = "x!=20";
    }

      println(res)

    val res2 =if (x != 20) "x == 20" else "x != 20";
    println(res2); */


    /*val name = "mark"
    val age = 18
    println(name + " is " + age + " years old")
    println(s"$name is $age years old")
    println(f"$name%s is $age%d years old")
    println(s"hello \nworld")
    println(raw"Hello \nworld")*/


    /*var i=0

    def printPrimes(): Unit ={
      val primeList = List(1,2,3,5,7,11)
      for (i <- primeList){
        if (i==11){
          return
        }

        if(i != 1){
          println(i)
        }
      }
    }
    printPrimes */


    /*var i=0
    for(i <- 1 to 5; j <- 6 to 10) {
      println("i:" + j)
      println("j:" + j)
    }*/


    /* val evenList = for {i <- 1 to 20
                         if (i % 2) == 0
                         } yield i

     for(i <- evenList) {
       println(i)
     } */


    /* var i = 0

    val aList =List(1,2,3,4,5)

    for (i <- aList) {
      println("List items"+ i)
    } */


    /*var i = 0

    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    for (i <- 0 until randLetters.length)
      println(randLetters(i)) */


    /* var i = 0

    for (i <- 1 to 10)
      println (i) */


    /* var i=0

    do {
      println(i)
      i += 1
    } while (i <= 20) */

    //println("Hello world")
  }
}

//17.07 min