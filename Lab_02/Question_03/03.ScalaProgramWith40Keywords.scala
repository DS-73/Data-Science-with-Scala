/*
    Name -  Dhruv Saini
    Section - ML
    Class Roll no - 24

*/


class Program{
    val name = "Dhruv Saini";
    val age = 19;
    
    var num1:Int = 10;   var num2:Int = 20;
    
    def details(){
        printf("--- Details --- \n");
        printf("Name : %s\n", name);
        print("Age : "+ age);
        println();

        Console.println("Num1 = "+ num1);
        Console.println("Num2 = "+ num2);
    }
    def sum(): Int={
        var res = num1 + num2;
        return res;
    }
    def update(){
        printf("\n--- Update ---");
        
        printf("\nEnter Num1:  ");
        num1 = scala.io.StdIn.readInt();
        printf("Enter Num1:  ");
        num2 = scala.io.StdIn.readInt();
    }

}

object Main{
    def main(args:Array[String]){
        var p = new Program();
        p.details();

        var result1 = p.sum();
        printf("\n> Sum : %d\n", result1);
        p.update();

        var result2 = p.sum();
        printf("> Updated Sum : %d\n", result2);

    }
}