/**
 * Created by d.buetikofer on 04.07.2017.
 */
import java.util.Observable;
import java.util.Observer;

public class AutomaticGearbox implements Observer{


    //using default constructor


    @Override
    public void update(Observable obs, Object arg) {

        Speedometer speedo = (Speedometer)obs;
        if (speedo.getSpeed() > 0 && speedo.getSpeed() <= 10){
            System.out.println("*********** Driving in first gear");
        } else if (speedo.getSpeed() > 10 && speedo.getSpeed() <= 20) {
            System.out.println("*************Now driving in 2nd gear");
        } else if (speedo.getSpeed() > 20 && speedo.getSpeed() <= 40) {
            System.out.println("*************Now driving in 3rd gear");
        } else if (speedo.getSpeed() > 40 && speedo.getSpeed() <= 70) {
            System.out.println("*************Now driving in 4th gear");
        }

    }






}

