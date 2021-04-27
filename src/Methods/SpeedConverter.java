package Methods;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(540);
        System.out.println(toMilesPerHour(540));
    }
    public static long toMilesPerHour(double kilometersPerHour){
        double miles;
        if(kilometersPerHour<0){
            return -1;
        }else if(kilometersPerHour>=0){
            miles= kilometersPerHour*0.62137119;
            return Math.round(miles);
        }else{
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid value.");
        }else if(kilometersPerHour>=0){
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }else{
            System.out.println("Error.");
        }
    }
}

