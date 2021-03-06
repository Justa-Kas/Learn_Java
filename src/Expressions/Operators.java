package Expressions;

public class Operators {
    public static void main(String[] args) {
        int x=6;
        x++;
        x--;
        x+=7;
        x-=3;
        x*=4;
        x/=10;
        int operatorNumber=10;
        int operandNumber=97;
        operandNumber+=operatorNumber;
        operandNumber-=operatorNumber;
        operandNumber*=operatorNumber;
        operandNumber/=operatorNumber;
        System.out.println(x);
        System.out.println(operandNumber);
        boolean isLearning = true;
        if(isLearning){
            System.out.println("Yes!");
            int port=8;
            if (port==5) {
                System.out.println("variable is equal");
            if (port<2) {
                System.out.println("Yes, variable is less than 2.");
            }
            }
        }

    }
}
