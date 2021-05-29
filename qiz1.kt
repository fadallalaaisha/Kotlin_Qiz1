class Book(var Title:String, var Author:String,var page:Int){
    fun book(){
        var books= listOf(
            Book("kenyaNews","kenya",200),
            Book("BronAcrime","Noah",400),
            Book("Programming","Programmers",900),
        )
        var lists=books.sortedByDescending { Book->Book.Title }
        println(lists)

    }

}

//question2
fun squares(){
    var a=1
    do {
      if (a*10==0){
          println("is the square to 3000")
      }
    }
    while (a%10==3000)
    println("square")
}

//question3
class CurrentAccount(var accountNumber:Int,var Name:String,var balance:Double){
    fun deposit(amount: Double){
         balance+=amount
        println(balance+amount)
    }
    fun withdraw(amount: Double){
        balance-=amount
        println(balance-amount)
    }
    fun details(){
        println("Account Number is $accountNumber with balance $balance is operated by $Name")
    }
}

//question4
class SavingsAccount(var accountNumber:Int,var Name:String,var balance:Int){
fun withdrawal(withdrawals: Int){
    var checks=withdrawals
    println("checking how many times have one withdrawal per year?")
}
    fun withdraw(){
   var check=withdraw()
        //if ()
    }
}

fun main() {

    squares()

    var account=CurrentAccount(1122,"Aisha",20900.00)
    account.deposit(2500.0)
    account.withdraw(1000.0)
    account.details()

    var saving=SavingsAccount(2233,"Maha",23000)
}