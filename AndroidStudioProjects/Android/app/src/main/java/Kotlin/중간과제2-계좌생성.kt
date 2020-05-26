package Kotlin
//은행계좌 만들기
// - 계좌생성기(이름, 생년월일, 초기금액)
// - 잔고확인
// - 출금, 예금기능
fun main(args:Array<String>){
    val account:Account= Account("오재무", "1997년 6월 14일", 1000)
    println(account.CheckBalance())
    account.Save(1000)
    println(account.withDraw(2000))
    println(account.CheckBalance())
    println()
    val account2:Account= Account("오재무", "1997년 6월 14일", -1000)
    println(account2.CheckBalance())
    account2.Save(1000)
    println(account2.withDraw(2000))
    println(account2.CheckBalance())
}
class Account{
    val name : String
    val birth : String
    var balance : Int
    constructor(name:String, birth:String, balance:Int){
        this.name=name
        this.birth=birth
        if(balance>=0)
            this.balance=balance
        else{
            this.balance=0
        }
    }
    fun CheckBalance():Int{
        return balance
    }
    fun withDraw(amount:Int):Boolean{
        if(balance>=amount) {
            balance-=amount
            return true
        }
        return false

    }
    fun Save(amount:Int){
        balance+=amount
    }
}