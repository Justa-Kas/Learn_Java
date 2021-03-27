package Methods;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(true, 800, 5, 500);
        //This one has the +=1000 but the original one didn't. wasn't sure which one you wanted so i put both.//
        calculateScore(true, 10000, 8, 200);
        anotherScore(true, 10000, 8, 200);
        numberLottery("George", 62);
        tempConvertor(32.0, "C");
    }

    //I don't understand the step about the parameters going into here. did you want the values or just what i did?//
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void anotherScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void numberLottery(String nameHere, int numberGuessed) {
        if (numberGuessed == 67) {
            System.out.println(nameHere + " won the grand prize of 100k!!");
        } else if (numberGuessed < 50 && numberGuessed > 30) {
            System.out.println(nameHere + " won a 50\" 4K TV!!");
        } else if (numberGuessed > 50 && numberGuessed < 60) {
            System.out.println(nameHere + " won a tropical cruise for 2!!");
        }else if (numberGuessed > 60 && numberGuessed < 67) {
            System.out.println(nameHere + " won a new Ford Mach-E!!");
        }else{
            System.out.println("Better luck next time, "+nameHere);
        }
    }
    public static int calculateGuestTier(int score) {
        int value;
        if (score >= 1000) {
            value = 1;
        } else if (score >= 500 && score < 1000) {
            value = 2;
        } else if (score >= 100 && score < 500) {
            value = 3;
        } else {
            value = 4;
        }
        return value;
    }
    public static void challengeThree(int testReturns) {
        if (testReturns > 0) {
            System.out.println("Positive");
        } else if (testReturns < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("zero");
        }
    }
    public static double tempConvertor(double numbah, String typeTemp){
       double value;
        if(numbah<0.0) {
            return -1.0;
        }else if(!(typeTemp=="C" || typeTemp =="F")){
            return -1.0;
        }else if(numbah>0.0 && typeTemp =="C"){
             value = (double) ((numbah * 9/5)+32);
             return value;
        }else{
            value = (double) ((numbah-32)*5/9);
            return value;
        }
    }

}

