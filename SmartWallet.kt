import java.security.Security

//Smart Wallet using encapsulation and abstraction
class SmartWallet(private var walletId: String,
                  private var balance: Double,
                  private var ownerName: String,
                  private var securityPin: Int){

    fun getBalance(): Double{
        return balance
    }
    fun addFunds(amount : Double){
//
        when {
            amount > 0 ->{
                balance += amount
                println("Successfully Added Money: $amount.")}
            else -> {
                "Invalid Amount."

            }
        }
    }

    fun makePayment(amount : Double){
        if(amount < balance){
            balance -= amount
            println("Successfully Deducted Money: $amount.")
        }else{
            println("Invalid Amount.")
        }
    }


}
fun main(args: Array<String>) {
    val user = SmartWallet("3231",2000.0,"Neloy",3232)
    println("Initial Balance: ${user.getBalance()}")

    user.addFunds(100.0)
    println("Add Fund Balance: ${user.getBalance()}")

    user.makePayment(100.0)
    println("Make Payment Balance: ${user.getBalance()}")

}