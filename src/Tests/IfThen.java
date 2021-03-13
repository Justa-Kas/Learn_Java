package Tests;

import java.util.Set;

public class IfThen {
    public static void main(String[] args) {
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



