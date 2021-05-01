package LeapYear;

public class LeapYear {
    public static void main(String[] args) {
        leapYear();
    }
    public static void leapYear(){
        for(int i=2021;i>=1900;i--){
            if(i%4==0&&!(i==1900)){
                System.out.print(i+", ");
            }
        }
        System.out.println("are all leap years.");
    }
}
