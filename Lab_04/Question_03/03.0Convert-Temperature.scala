object Temperature{

    def convert_temp(temp_f: Double):Double = {
        var temp_c: Double = (temp_f - 32.0) * (5.0/9.0);
        return temp_c;
    }

    def main(args: Array[String]){
        print("Enter temperature in fahrenheit : ");
        var temp_f: Double = scala.io.StdIn.readDouble;

        // Convert Temperature
        var temp_c: Double = convert_temp(temp_f);
        println("Temperature in Celsius : " + temp_c);

    }
}