package com.example.kotlinexample1

// data class ClassName (val x:Type, y:Type)
data class Villager  (val name:String, val birthday:String, val phrase:String, val houseUrl:String,
                      val villagerUrl:String, var houseShown:Boolean = true){

    // toString
        // Villager(name="Henry", birthday="...", ...)
    // getters
    // setters
    // equals
}

// val -> do not come with setters
// var -> comes with both getters and setters
