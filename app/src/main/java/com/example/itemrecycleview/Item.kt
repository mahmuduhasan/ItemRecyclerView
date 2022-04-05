package com.example.itemrecycleview

data class Item(
    val id: Int,
    val name:String,
    val price: Int
)

val itemList = mutableListOf<Item>(
    Item(1,"Pepsi", 15),
    Item(2,"Coca Cola",20),
    Item(3,"7up", 25),
    Item(4,"Potato Chips", 10),
    Item(5,"Patata Biscuit", 15),
    Item(6,"Bread", 5),
    Item(7,"Tea", 5),
    Item(8,"Banana", 5),
    Item(9,"Peyaju", 5),
    Item(10,"Alur Chop", 5),
    Item(11,"Mirinda", 20),
    Item(12,"Speed", 25),
    Item(13,"GANJA", 250),
    Item(14,"Tiger", 25),
    Item(15,"Big Bull", 25),
)
