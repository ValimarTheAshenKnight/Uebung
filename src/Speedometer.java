/**
 * Created by d.buetikofer on 04.07.2017.
 */
import java.util.Observable;

public class Speedometer extends Observable{


    private int speed;

    public Speedometer(int speed){
        speed = 0;
    }


    public void setSpeed(int speed){
        this.speed = speed;


        //Notify all observers when speed has changed:
        this.setChanged();
        this.notifyObservers();
    }

    public int getSpeed(){
        return speed;
    }

}

