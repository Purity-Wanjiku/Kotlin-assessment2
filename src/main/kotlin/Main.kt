fun main() {
println( checkVowels("Bananax"))
//    println(validPassword(arrayOf(234,"ryu")))
multiples()

    var equity=CurrentAccount(222111555,"Msosi",4500.00)
    equity.deposit(200.00)
    equity.withdraw(1000.00)
    equity.details()
 }
//No. 1
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
//

data class Values(var firstchar:Char, val lastChar: Char, var length:Int,var checkvowel:Boolean)


fun checkVowels(word:String):Triple<Char,Char,Int> {
    var firstchar = word.get(0)
    var lastChar = word.get(word.length - 1)
    var length = word.length

    return Triple(firstchar, lastChar, length)
}
//    fun checkV(word:String){
//    var vowels = arrayOf('a','e','i','o','u')
//    var wordLowercase = word.toLowerCase()
//    var checkvowel = if (wordLowercase[0] in vowels)
//        return true
//    {
//        else {
//            false
//    }
//    }
//    return (firstchar,lastChar,length,checkvowel)


//No. 2
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

//fun validPassword(pass:Array<Any>):Boolean{
//    var password = pass
//   for (i in password){
//       if (i in 1..8 && i in 9.. 16 && i != "password" )
//           return true
//    }else{
//       return false
//    }
//}

//No. 3
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples (){
    for (x in 1..1000){
        if (x%6 == 0 && x%8 == 0) {
            println("bingo")
        }else if (x%6 == 0){
            println(x)
        }else if (x%8 ==0){
            println(x)
        }else null
    }
}
//No. 4
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

open class CurrentAccount(var accountNumber:Int, var accountName:String,var balance:Double){

    fun deposit(amount: Double){
        var total = amount + balance
        println(total)
    }

    fun withdraw(amount: Double){
        var lessTotal = balance - amount
        println(lessTotal)
    }

    fun details(){
        println("Account number $accountNumber with $balance is operated by $accountName")
    }

}

//No. 5
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal

//class SavingsAccount():CurrentAccount(accountNumber, accountName, balance){
//
//}