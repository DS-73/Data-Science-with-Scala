
object power{
    def main(args: Array[String]){
        print("Enter Number : ");
        var num:Double = scala.io.StdIn.readDouble();

        println("\nSquare of " + num + " is : " + scala.math.pow(num, 2));
        println("Cube of " + num + " is : " + scala.math.pow(num, 3));
        println("Fourth power of " + num + " is : " + scala.math.pow(num, 4));

    }
}