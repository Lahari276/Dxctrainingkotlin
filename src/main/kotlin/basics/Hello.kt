package basics

class Rectangle(var height : Int, width : Int){
    var perimeter = 2 * (height+width)
}
fun main(){
    var rectangle = Rectangle(20,30)
    println("perimeter of rectangle is ${rectangle.perimeter}")
    println("hii guys")
    var a : Int = 10;
    var b = 20;
    //var d;
    var c = add(10,20);
    print(c)
}

fun add(firstNo : Int,sno : Int) : Int {
    return firstNo+sno
}