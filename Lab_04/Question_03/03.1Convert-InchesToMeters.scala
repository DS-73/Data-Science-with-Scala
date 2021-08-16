object Distance{

    def convert_distance(inches: Double):Double = {
        var meters: Double = inches * 0.0254;
        return meters;
    }

    def main(args: Array[String]){
        print("Enter distance in inches : ");
        var inches: Double = scala.io.StdIn.readDouble;

        // Convert Temperature
        var meters: Double = convert_distance(inches);
        println("Distance in meters : " + meters);

    }
}