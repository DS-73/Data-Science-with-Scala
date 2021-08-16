object PrimeNumber{

    def checkPrime(num: Int) :Boolean ={
        var i:Int  = 2;
        for(i <- 2 to num/2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    def main(args: Array[String]){
        print("Enter Number : ");
        var num: Int = scala.io.StdIn.readInt();

        if(checkPrime(num)){
            println(num + " is a prime number.");
        }
        else{
            println(num + " is a non-prime number.");
        }

    }
}