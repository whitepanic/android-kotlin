package com.example.test_20200719

 fun main() {
     var map1 = mapOf(Pair("name","aaa"))
     var map2 = mutableMapOf<String, String>()
     map2.put("name", "bbb")
     map2.put("name", "ddd")


     for(map in map2) {
         println(map)
     }




 }