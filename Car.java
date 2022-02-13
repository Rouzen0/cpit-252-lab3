
package app3;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Car implements Cloneable{
    String make;
    String modle;
    int yeat;
    List <Recall> reacalls;
    public Car(String make, String modle, int yeat) {
        this.make = make;
        this.modle = modle;
        this.yeat = yeat;
        this.reacalls=fetchRecalls();
    }
    
    public Car cloneCar(){
    return new Car(this.make,this.modle,this.yeat);
    }
    
    public List<Recall> fetchRecalls(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public int getYeat() {
        return yeat;
    }

    public void setYeat(int yeat) {
        this.yeat = yeat;
    }
    
    
}
