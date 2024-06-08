package Methods;

public interface DefaultInterface {

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
    default String speedUp() {
        return "The vehicle is speeding up.";
    }
    default String slowDown() {
        return "The vehicle is slowing down.";
    }
    default String turnAlarmOn() {
        return "The vehicle alarm is on.";
    }

    default String turnAlarmOff() {
        return "The vehicle alarm is off.";
    }
    
    String getBrand();
}
