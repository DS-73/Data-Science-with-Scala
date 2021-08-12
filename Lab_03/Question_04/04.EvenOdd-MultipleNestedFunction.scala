/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24
*/

object oddEven{
    // Nested Function
    def solve(){
        println("\n--- Output ---");
        // Nested Function 01
        def checkOddEven(){
            // Nested Function 02
            def get_input():Int = {        
                print("Enter Number : ")
                var num:Int = scala.io.StdIn.readInt();

                return num;
            }

            var num: Int = get_input;
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
        // Fuction Call
        solve();
    }
}