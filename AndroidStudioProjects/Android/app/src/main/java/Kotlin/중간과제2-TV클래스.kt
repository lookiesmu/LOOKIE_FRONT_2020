package Kotlin
//TV클래스
//ON/OFF기능
//채널 돌리는 기능
//초기채널은 3개(S사, M사, K사)
fun main(args:Array<String>){
    val tv:TV=TV(listOf("SBS","MBC","KBS"))
    tv.switch()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
}
class TV(val channels:List<String>){
    var onOff : Boolean = false // True = On, False = off
    var currentChannelNum:Int=0
        set(value){
            field=value
            if(field>2)
                field=0
            if(field<0)
                field=2
        }
    fun switch(){
        onOff=!onOff
    }
    fun checkCurrentChannel():String{
        return channels[currentChannelNum]
    }
    fun channelUp(){
        currentChannelNum++
//        channels.forEachIndexed { index, value ->
//            if(currentChannelNum==index){
//                currentChannelNum+=1
//                return
//            }
//        }
    }
    fun channelDown(){
        currentChannelNum--
//        channels.forEachIndexed { index, value ->
//            if(currentChannelNum==index){
//                currentChannelNum-=1
//                return
//            }
//        }
    }

}
