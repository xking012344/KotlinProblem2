fun main() {
    println("Use the val keyword when the value doesn't change")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    println("New chat message from a friend")

    val discountPercentage: Int = 20
    var offer: String = ""
    val item = "Google Chromecast"
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)

    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = firstNumber + secondNumber
    val anotherResult = firstNumber + thirdNumber
    val extraResult = thirdNumber - secondNumber
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$thirdNumber - $secondNumber = $extraResult")

    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"


    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(operatingSystem: String, emailId: String) {

    println("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")


    val firstUserEmailId = "user_one@gmail.com"
    val firstUserOperatingSystem = "Unknown OS"
    println("There's a new sign-in request on $firstUserOperatingSystem for your Google Account $firstUserEmailId.")

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println("There's a new sign-in request on $secondUserOperatingSystem for your Google Account $secondUserEmailId.")

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println("There's a new sign-in request on $thirdUserOperatingSystem for your Google Account $thirdUserEmailId.")
}
