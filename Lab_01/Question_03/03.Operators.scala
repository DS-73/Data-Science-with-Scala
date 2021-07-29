/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24

    Question 03 - Operators in Scala

*/

object operator{

    def main(args: Array[String]){
        var a = 100; var b = 20;

        // --- Arithmetic Operators ---
        println("---- Operations ----")
        println("> Addition : "+ (a + b))
        println("> Subtraction : "+ (a - b))
        println("> Multiplication : "+ (a * b))
        println("> Division : "+ (a / b))

        // --- Bitwise Operators ---
        println("\n---- Bitwise ----")
        println("> OR operator : "+ (a | b))
        println("> And operator : "+ (a & b))
        println("> XOR operator : "+ (a ^ b))

        // --- Logical Operators ---
        val x = true;     val y = false;
        println("\n---- Logical ----")
        println("> OR operator : "+ (x || y))
        println("> And operator : "+ (x && y))

        // --- Relational Operators ---
        println("\n---- Relational ----")
        if(a > b){
            println(a + " is greater than "+ b);
        }
        else if(a == b){
                println(a+ " is euqal to "+ b);
        }
        else{
            println(b+ " is greater than "+ a)
        }
    }
  
}

/*
    -- Output --  

    ---- Operations ----
    > Addition : 120
    > Subtraction : 80
    > Multiplication : 2000
    > Division : 5

    ---- Bitwise ----
    > OR operator : 116
    > And operator : 4
    > XOR operator : 112

    ---- Logical ----
    > OR operator : true
    > And operator : false

    ---- Relational ----
    100 is greater than 20

*/