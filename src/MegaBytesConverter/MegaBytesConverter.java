package MegaBytesConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value.");
        }else if(kiloBytes>=0){
            System.out.println(kiloBytes +" KB = "+kiloBytes/1000+ "MB and "+kiloBytes%1000 +" KB.");
    }else{
            System.out.println("Error.");
        }
}}
