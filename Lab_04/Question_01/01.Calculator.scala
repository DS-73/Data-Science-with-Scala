object calculator{

    var divide = (num1: Int, num2: Int) => num1/num2;
    var multiply = (num1: Int, num2: Int) => num1*num2;
    var subtract = (num1: Int, num2: Int) => num1 - num2;
    var addition = (num1: Int, num2: Int) => num1 + num2;
    
    def main(args:Array[String]){
        print("Enter Num1 : ");
        var num1:Int = scala.io.StdIn.readInt();
        
        print("Enter Num2 : ");
        var num2:Int = scala.io.StdIn.readInt();
        
        println("\n--- Options ---");
        println("1. Divide");
        println("2. Multiply");
        println("3. Subtract");
        println("4. Addition");

        print("\nSelect one option : ");
        var choice:Int = scala.io.StdIn.readInt();
        if(choice == 1){
            println("Division : " + divide(num1, num2));
        }
        else if(choice == 2){
            println("Multiply : " + multiply(num1, num2));
        }
        else if(choice == 3){
            println("Subtract : " + subtract(num1, num2));
        }
        else if(choice == 4){
            println("Addition : " + addition(num1, num2));
        }
        else{
            println("Exiting : Wrong Choice ...");
        }


    }

}


