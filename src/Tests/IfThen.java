package Tests;


public class IfThen {
    public static void main(String[] args) {
        forLoop(100);
        forLoop(67);
        forLoop(147);
        doWhile();
        }
    public static void forLoop(int factorFest){
        for(int i=1;i<factorFest;i++){
            if(factorFest%i==0){
                System.out.print(i+", ");
            }

        }
        System.out.println("and "+factorFest+" are all variables of "+factorFest+".");
    }
    public static void doWhile(){
        int rill = 70;
        int jill = 1;
        System.out.print("The factors of 70 are ");
        do {
            if (rill % jill == 0) {
                System.out.print(jill+", ");
            }
            jill++;
        }while(jill < 70) ;
        System.out.println("and 70!");
    }



        }



