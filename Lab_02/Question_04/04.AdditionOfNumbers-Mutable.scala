/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24

*/


object Addition{

    def addNumbers(number1: Int, number2: Int) : Int={
        var result: Int = number1 + number2;
        return result;
    }

    def main(args: Array[String]){
        var number1: Int = 10;
        var number2: Int = 20;

        printf("Sum : %d", addNumbers(number1, number2));
    }
}