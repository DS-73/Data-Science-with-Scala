/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24
*/

object oddEven{
    // Nested Function
    def solve(num: Int){
        println("\n--- Output ---");
        def checkOddEven(){
            if(num % 2 == 0){
                println(num + " is even");
            }
            else{
                println(num + " is odd");
            }
        }
        checkOddEven();
    }

    def main(args:Array[String]){
        print("Enter Number : ")
        var num:Int = scala.io.StdIn.readInt();

        solve(num);

    }
}