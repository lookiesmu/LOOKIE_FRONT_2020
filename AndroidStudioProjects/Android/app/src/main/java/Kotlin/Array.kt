package Kotlin
//1. 배열 만드는법
// var arr1=arrayOf<Type>{value1, value2, ...};
// var arr2=intArrayOf(num1, num2,..);
// var arr3=charArrayOf(char1, char2, ..);

fun main(args:Array<String>){
    first();
}
fun first(){
    val list1= MutableList(9,{0});
    val list2= MutableList(9,{true});

    for(i in 0..8){
        list1[i]=i+1;
    }
    println(list1);
    for(j in 0..8) {
        if (list1[j] % 2 == 0)
            list2[j] = true;
        else
            list2[j] = false;
    }
    println(list2);
}
