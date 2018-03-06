 fun main(args: Array<String>) {
	//Declare a constant of type unsigned 8 bit integer named sample1 with an initial value of 0x3A
    var sample1: Byte = 0x3A
    
    //Declare a variable of type unsigned 8 bit integer named sample2 with an initial value of 58
    var sample2: Int = 58
    //Declare an integer variable named heartRate with an initial value of 85
    
    var heartRate = 85
    //Declare a double variable named deposits that has an initial value of 135002796
 	var deposits = 135002796
    
    //Declare a float constant named acceleration that has an initial value of 9.800
	var acceleration = 9.800f
    
    //Declare a float variable named mass that has an initial value of 14.6
	var mass = 14.6f
    
    //Declare a double variable named distance that has an initial value of 129.763001
    var distance = 129.763001
    
    //Declare a boolean variable named lost that has an initial value of true
    var lost = true
    
    //Declare a boolean variable named expensive that has an initial value of true
	var expensive = true
    
    //Declare an integer variable named choice with an initial value of 2
    var choice = 2
    
    //Declare a constant that is a character type named integral that has a value of “\u{222B}”
    var integral = '\u222B'
    
    //Create a string constant named greeting that has an initial value of “Hello”
    val greeting = "Hello"
    
    //Create a string variable named name that has an initial value of “Karen”
    val name = "Karen"
    
    //Compare sample1 to sample2 and if they are equal display “The samples are equal.” 
    //otherwise display “The samples are not equal.”
    
    if(sample1.equals(sample2)) {
    	println("The samples are equal.")
    } else {
    	println("The samples are not equal.")
    }
    
    
    //If heartRate is greater than equal to 40 and less than equal to 80 display 
    //“Heart rate is normal.” otherwise display “Heart rate is not normal.”
    if(heartRate >= 40 && heartRate <= 80)
    	println("Heart rate is normal")
	else
    	println("Heart rate is not normal")
    
    //If deposits is greater than or equal to 100000000 display 
    //“You are exceedingly wealthy.” otherwise display “Sorry you are so poor.”
    if(deposits >= 100000000)
    	println("You are exceedingly wealthy")
    else
    	println("Sorry you are so poor.")

    //Declare a variable called force that is assigned to the mass times the 
    //acceleration. The force variable must be of the same type as the type that 
    //results from the multiplication of mass and acceleration.
    var force = mass * acceleration
    
    //Display the calculated force preceded by the string “force = ”. The output 
    //should look like the following (actual value will be different): force = 2.345
    println("force = $force")
    
    //Display the value of distance followed by “ is the distance.”
	println("$distance is the distance")
    
    //Using lost and expensive display “I am really sorry! I will get the manager.” 
    //if lost and expensive are both true and “Here is coupon for 10% off.” if lost 
    //is true and expensive is false.
	if(lost == true && expensive == true)
    	println("I am really sorry! I will get the manager.")
    else
    	println("Here is coupon for 10% off.")

	//Use the Kotlin “when” expression and the variable choice to display “You chose 1.” 
	//if choice is 1, “You chose 2.” if choice is 2, “You chose 3.” if choice is 3, and 
	//“You made an unknown choice.” if choice is something other than 1, 2, or 3.
	when(choice) {
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> println("You made an unknown choice.")
    }

	//Using the character constant integral, display the character in integral followed by 
	//the string “ is an integral.”
	println("$integral is an integral")

    //Using a “for” loop count from 5 to 10 (inclusive of start and end) using an integer 
    //variable i. Inside the loop display each value of i with a line that is “i = ” 
    //followed by the value of i
    for(i in 5..10) {
        println("i = $i")
    }
    
    //Declare an integer variable age with an initial value of 0. Using a “while” loop that 
    //continues while age is less than 6 display the value of age in a line that begins with 
    //“age = ” and is followed by the value of age. (Example: age = 3) After the age line is 
    //displayed increment the value of age by 1.
    var age = 0
    while(age < 6) {
    	println("age = $age")
    	age++
    }
    
    //Display a line that contains the greeting string followed by a space followed by the name string.
    println("$greeting $name")
}
