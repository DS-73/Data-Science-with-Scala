/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24
*/

object inlineFunciton{

    def increment(num: Int) :Int = num + 1;
    def checkZero(num: Int) :Boolean = return (num == 0);
    def product(num1: Int, num2: Int) :Int = return (num1 * num2);

    def isZero(num: Int){
        if(checkZero(num)){
            println(num + " is zero.");
        }
        else{
            println(num + " is not zero.");
        }
    }

    def main(args: Array[String]){
        print("Enter num1 : ");
        var num1: Int = scala.io.StdIn.readInt();
    
        print("Enter num2 : ");
        var num2: Int = scala.io.StdIn.readInt();
    
        println("\n--- Output ---");
        println(num1 + " + 1 = " + increment(num1));
        println(num2 + " + 1 = "  + increment(num2));

        isZero(num1);       isZero(num2);
        println("Product : " + product(num1, num2))
    }

}