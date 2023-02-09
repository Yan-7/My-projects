public class Car {

    private static int counter = 1;
    private int number;
    private int speed; //0-100

    public Car(int speed) {
        this.number = counter;
        this.speed = speed;
        counter++;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public  Car[] carFactory (int carsAmount) {
        Car[] cars = new Car[carsAmount];
        for (int i = 0; i <carsAmount ; i++) {
            Car car = new Car(0);
            cars[i] = car;
        }
        return cars;
    }


    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", speed=" + speed +
                '}';
    }
}
