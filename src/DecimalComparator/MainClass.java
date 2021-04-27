package DecimalComparator;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(34.237,34.237));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(34.2373,34.237));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(36.237,34.237));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(34.237,34.2376));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(34.237,39.237));
    }
}
