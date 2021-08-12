object MaxAndMin{

/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24
*/

    def get_minmax(num1: Int, num2: Int){
        println("\n--- Output ---");
        def max(){
            if(num1 > num2){
                println("Max Value : " + num1)
            }
            else{
                println("Max Value : " + num2)
            }
        }

        def min(){
            if(num1 < num2){
                println("Min Value : " + num1)
            }
            else{
                println("Min Value : " + num2)
            }
        }

        max();
        min();
    }

    def main(args: Array[String]){
        print("Enter Num1 : ");
        var num1:Int = scala.io.StdIn.readInt();
        print("Enter Num2 : ");
        var num2:Int = scala.io.StdIn.readInt();
        
        get_minmax(num1, num2);

    }
}