package DecimalComparator;

public class DecimalComparator {
public static boolean areEqualByThreeDecimalPlaces(double param1, double param2){
    int casted1= (int) param1*1000;
    int casted2= (int) param2*1000;
    if(casted1==casted2){
        return true;
    }else{
        return false;
    }
}
}
