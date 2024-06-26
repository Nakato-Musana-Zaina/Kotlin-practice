fun main(args: Array<String>) {
    println("Hello World!")
    students("Nakato", "Adalab")
    area(20,30)
    bmi(160.0, 80.0)
    println(information(20,"Nakato", "green"))
    arr(arrayOf("hens","Goats","camels","chicks","antelope"))
}
// create a function that takes it both the name and class of a student in AkiraChix
fun students(name:String,classroom:String){
    var details = "$name   is in  $classroom"
    println(details)
}
//Practice on Variables
//Write a program that calculates the area of a rectangle.
// The user should be prompted to enter the length and width of the rectangle.
fun area(length:Int, width:Int){
    var areas = length*width
    println(areas)
}


//Write a function to check if a given string contains only digits in Kotlin.
//Write a Kotlin function that takes a 'name' as an argument and prints a personalized greeting message to the user.
fun name(names:String){
    var output= " Hello $names, It is a pleasure to have you Join us."
}


//Write a Kotlin function that calculates the Body Mass Index (BMI) of a person. The function should take the height
// (in meters) and weight (in kilograms) as arguments. Use default arguments for height and weight.

fun bmi(height:Double,weight:Double){
    var heightToMeters = height*0.01
    var bmiheight = heightToMeters*heightToMeters
    var bMI = weight/bmiheight
    println(bMI)
}

//Write a program that propmts the user to enter their name , age , favorite color, and then prints out a message including all their information.
fun information(age:Int, name: String, favoriteColor : String){
    var sentences = "Hello my name is $name , i am $age years old and my color is $favoriteColor"
    println(sentences)
}
//Write a function that takes an array of strings as a parameter and returns the length of the longest string.
fun arr(words: Array<String>){
    println(words.maxOrNull())
}

//Write a function that takes a list of strings as a parameter and returns a new list with all the strings in uppercase.

