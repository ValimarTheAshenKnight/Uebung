/**
 * Created by d.buetikofer on 04.07.2017.
 */
import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer{

    public static final int speed_to_alert = 70;


    //using default constructor

    @Override
    public void update(Observable obs, Object obj) {

        Speedometer speedo = (Speedometer)obs;
        if (speedo.getSpeed() > speed_to_alert){
            System.out.println("***** ALERT ***** Driving too fast! - " + speedo.getSpeed());
        } else {
            System.out.println("You're driving nice and easy..... - " + speedo.getSpeed());
        }


    }



}

