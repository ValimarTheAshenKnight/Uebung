/**
 * Created by d.buetikofer on 04.07.2017.
 */

public class TestObserver {

    public static void main(String[] args) {

        //create monitors = observers:

        SpeedMonitor monitor = new SpeedMonitor();
        AutomaticGearbox box = new AutomaticGearbox();

        Speedometer meter = new Speedometer(10);
        meter.addObserver(monitor);
        meter.addObserver(box);

        //drive at different speed:

        meter.setSpeed(20);
        meter.setSpeed(30);
        meter.setSpeed(80);
        meter.setSpeed(20);
        meter.setSpeed(50);

    }

}

