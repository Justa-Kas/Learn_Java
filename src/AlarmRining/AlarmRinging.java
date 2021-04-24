package AlarmRining;

public class AlarmRinging {
    public static boolean shouldWakeUp(boolean ringing, int hourOfDay){
        if(!ringing || hourOfDay<0 || hourOfDay>23) {
            return false;
        }else if(ringing==true &&(hourOfDay<8 || hourOfDay>22)){
            return true;
        }else{
            return false;
        }
    }
}
