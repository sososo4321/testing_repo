package tempTests;

import java.util.ArrayList;
import java.util.List;

public class Car {
    class Door{}
    List<Wheel> wheels;
    public Wheel getHelp(Wheel wh){
        return wh;
    }
    public Car(){
        this.wheels = new ArrayList<>();
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());
    }
}
