package Interfaces;

import Interfaces.Car;
import Interfaces.Engine;
import Interfaces.Media;
import Interfaces.NiceCar;

public class Main {
    public static void main(String[] args) {
//       Car car = new Car();
//        Engine car = new Car();
//        car.a;

//       car.acc();
//       car.start();
//       car.stop();

//       Media carMedia = new Car();
//       carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
