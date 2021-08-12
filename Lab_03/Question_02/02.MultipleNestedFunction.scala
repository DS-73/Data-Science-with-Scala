/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24
*/

object MaxAndMin{

    def get_minmax(num1: Int, num2: Int){
        println("\n--- Output ---");

        // Nested Function 01
        def max_calculate(){
            // Nested Function 02
            def max(): Int ={
                if(num1 > num2){
                    return num1;
                }
                return num2;
            }
            println("Max Value : " + max());
        }

        // Nested Function 01
        def min_calculate(){
            // Nested Function 02
            def min(): Int={
                if(num1 < num2){
                    return num1;
                }
                return num2;
            }
            println("Min Value : " + min());
        }
        
        max_calculate();
        min_calculate();
    }

    def main(args: Array[String]){
        print("Enter Num1 : ");
        var num1:Int = scala.io.StdIn.readInt();
        print("Enter Num2 : ");
        var num2:Int = scala.io.StdIn.readInt();
        
        get_minmax(num1, num2);

    }
}