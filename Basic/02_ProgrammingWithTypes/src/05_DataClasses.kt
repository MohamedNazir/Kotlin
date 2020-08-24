fun main() {
  var item = Item(12, "Biscuits", 5)
    println(item)
    println(item.hashCode())

  val item2 = item.copy(id=34)
  print(item2)
}

// class Item(var id:Int, var name:String, var quantity:Int =0) // this won't print toString, or has code

data class Item(var id:Int, var name:String, var quantity:Int =0) // this will print toString, or has code
