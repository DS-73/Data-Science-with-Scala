/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24

*/


object Addition{

    def addNumbers(number1: Int, number2: Int) : Int={
        val result: Int = number1 + number2;
        return result;
    }

    def main(args: Array[String]){
        val number1: Int = 10;
        val number2: Int = 20;

        printf("Sum : %d", addNumbers(number1, number2));
    }
}