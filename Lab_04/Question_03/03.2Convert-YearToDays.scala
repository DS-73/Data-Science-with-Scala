object Days{

    def convert_years(years: Int):Int = {
        var days: Int = years * 365;
        return days;
    }

    def main(args: Array[String]){
        print("Enter distance in years : ");
        var years: Int = scala.io.StdIn.readInt;

        // Convert Temperature
        var days: Int = convert_years(years);
        println("Total Days : " + days);

    }
}