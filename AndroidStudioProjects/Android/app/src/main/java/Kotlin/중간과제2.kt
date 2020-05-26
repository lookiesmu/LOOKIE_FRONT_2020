package Kotlin
fun main(args:Array<String>){
    val cal1=Calculater1()
    println(cal1.plus(4,5))
    println(cal1.minus(4,5))
    println(cal1.mul(4,5))
    println(cal1.div(4,5))
    println()

    val cal2=Calculator2()
    println(cal2.plus(1,2,3,4,5))
    println(cal2.min(10,9,8,7))
    println(cal2.mul(1,2,3,4,5,6,7,8,9))
    println(cal2.div(10,2,5))
}
//1-1) 간단한 계산기
class Calculater1(){
    fun plus(a:Int, b:Int):Int{
        return a+b
    }
    fun minus(a:Int, b:Int):Int{
        return a-b
    }
    fun mul(a:Int, b:Int):Int{
        return a*b
    }
    fun div(a:Int, b:Int):Int{
        return a/b
    }
}
//1-2) 2개의 수 이상의 사칙연산
class Calculator2(){
    //vararg : 가변인자
    fun plus(vararg nums :Int):Int{
        var result:Int = 0
        nums.forEach {
            result+=it
        }
        return result
    }
    fun min(vararg nums :Int):Int{
        var result = nums[0]
        for(i in 1 until nums.size)
            result-=nums[i]
        return result
    }
    fun mul(vararg nums :Int):Int{
        var result = 1
        nums.forEach {
            result*=it
        }
        return result
    }
    fun div(vararg nums :Int):Int{
        var result = nums[0]
       nums.forEachIndexed { index, value ->
           if(index!=0 && value!=0)
               result = result / value
       }
        return result
    }
}