package AlarmRining;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(AlarmRinging.shouldWakeUp(true,4));
        System.out.println(AlarmRinging.shouldWakeUp(false,5));
        System.out.println(AlarmRinging.shouldWakeUp(true,9));
        System.out.println(AlarmRinging.shouldWakeUp(true,8));

    }

}

