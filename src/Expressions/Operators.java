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
        int someNumber= 9;
        int otherNumber = 5;
        operandNumber+=operatorNumber;
        operandNumber-=operatorNumber;
        operandNumber*=operatorNumber;
        operandNumber/=operatorNumber;
        System.out.println(x);
        System.out.println(operandNumber);
        boolean isLearning = true;
        boolean waterOn = true;
        int testNumber=31;
        int aNewNumber = 6;
        int someOtherNumber = 13;
        int examGrade;
        /*if(isLearning){
            System.out.println("Yes!");
            int port=8;
            if (port==5) {
                System.out.println("variable is equal");
            if (port<2) {
                System.out.println("Yes, variable is less than 2.");
            }
            }
        }

        if(someNumber == otherNumber) {
            System.out.println("They are equal");
        }
        if(someNumber != otherNumber) {
            System.out.println("They are not equal");
        }
        if(!waterOn){
            System.out.println("Water is not flowing.");
        }
        int aNumber = 5;
        int anotherNumber = 20;
        if(aNumber < anotherNumber && aNumber > 2){
            System.out.println("The number is between 2 and 20");
        }
        if(testNumber<40 && testNumber>3){
            System.out.println("True");
        }
        if(!(testNumber>1 && testNumber<50)){
            System.out.println("False");
        }
        if(testNumber>33 && testNumber<45){
            System.out.println("True");
        }
        if(testNumber!=33){
            testNumber = 33;
            System.out.println(testNumber);
        }
        if(aNewNumber <5 || someOtherNumber> 5){
            System.out.println("My condition has been satisfied");
        }
        int value1=20;
        int value2=35;
        if(value1<20 || value2<20){
            System.out.println("True.");
        }
        if(value1>30 && value2>30){
            System.out.println("Both values are above 30.");
        }
        if(value1!=value2){
            System.out.println("Values 1 and 2 are not equal.");
        }
        boolean isDriving = false;
        boolean isMoving = isDriving ? true:false;
        if(isMoving){
            System.out.println("Is moving is true.");
        }
        boolean isItTheSink = waterOn ? true:false;
        if(!isItTheSink){
            System.out.println("Good work");}
        else{
            System.out.println("Go turn off the water");
        }*/
       examGrade = 87;
        if(examGrade <=100 && examGrade >=97){
            System.out.println("A+");
        }else if(examGrade <97 && examGrade >=94){
            System.out.println("A");
        }else if(examGrade <94 && examGrade >=90){
            System.out.println("A-");
        }else if(examGrade <90 && examGrade >=85){
            System.out.println("B");
        }else if(examGrade <85 && examGrade >=80){
            System.out.println("B-");
        }else if(examGrade <80 && examGrade >=70){
            System.out.println("C");
        }else if(examGrade <70){
            System.out.println("F");
        }else{
            System.out.println("Grade not available.");
        }

 }}

