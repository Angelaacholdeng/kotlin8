fun main() {
    println(isEven(30))
    println(isEven(35))
   var shopping=Product("carrots",50.4,500.00,"grocery")
    var species=Product("garlics",20.5,300.50,"shop")
    shopping.sortProduct()
    species.sortProduct()
    println(checkword("banana"))
    println (person(arrayOf("Teda","Adhiu","Abpkmamade","Akon")))

}
fun isEven(numb:Int):Boolean{
    if(numb%2==0){
        return true
    }
    else{
        (numb%2!=0)
        return false
    }

}
data class Product(var name:String,var weight:Double,var price:Double,var category:String){
    fun sortProduct(){
        var grocery=mutableListOf<String>()
        var hygiene=mutableListOf<String>()
        when (category){
            "groceries"->println(mutableListOf("$name","$category"))
            "hygiene"->println((mutableListOf("$name","$category")))
               else ->  println ("Any other category")


        }
    }
}
fun checkword(word:String):String{
    var name=""
    for(letter in word){
        if(word.indexOf(name)%2==0){
            name+=name
        }
    }
    return name
}
fun person(names:Array<String>):MutableList<String>{
    var longNameList=mutableListOf<String>()
    for(name in names){
        if(name.length%2==0){
            longNameList.add(name)
        }
    }
    return longNameList
}