package Variables;

public class MyFirstVariable {
    public static void main(String[] args) {
        int myFirstVariable = 5;
        int solidNumber = 20;
        int mySecondVariable = 10;
        int myThirdVariable = 5;
        int myTotal = myThirdVariable + mySecondVariable;
        int calculation = (myFirstVariable + mySecondVariable) * myTotal;
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        long myLong = 100L;
        double someNumber = 3.0/2.0;
        int wrongType = (int) (3.0/2.0);
        int celsius = 18;
        int fahrenheit = 61;
        double conversionc = (double) ((celsius * 9/5)+32);
        double conversionf = (double) ((fahrenheit-32)*5/9);
        //System.out.println(myFirstVariable);//
        //System.out.print("20 ");//
       // System.out.print(solidNumber + " ");//
        //System.out.print(mySecondVariable *2 + " ");//
        //System.out.print(10+10+" ");//
       // System.out.println(mySecondVariable + mySecondVariable);//
        //System.out.println(myTotal);//
       // System.out.println(calculation);//
        System.out.println("Integer min value = "+minIntValue);
        System.out.println("Integer max value = "+maxIntValue);
        System.out.println(minLongValue);
        System.out.println(maxLongValue);
        System.out.println(someNumber);
        System.out.println(conversionc+"F");
        System.out.println(conversionf+"C");
    }
}
