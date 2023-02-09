import java.util.Arrays;

public class Highway {
    String name;
    Car[] cars;

    public Highway(String name, Car[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public Car[] getCars() {
        return cars;
    }

    public static void oneHighwayCapacity (Highway highway) {
        System.out.println("this highWay capacity: " +highway.getCars().length);
    }
    public static void addCar(Car car,Highway highway) {
        for (int i = 0; i <highway.cars.length ; i++) {
            if (highway.getCars()[i]== null) {
                highway.getCars()[i] = car;
            }
        }
    }
    public int avgSpeed () {
        int sum =0;

        for (int i = 0; i <cars.length ; i++) {
            sum += cars[i].getSpeed();
        }
        int avgSpeed = sum/cars.length;
        return avgSpeed;
    }
    public void maxSpeed() {
        int max = 0;
        Car car = new Car(0);
        for (int i = 0; i <cars.length ; i++) {
            if (cars[i].getSpeed()>max) {
                max = cars[i].getSpeed();
                car = cars[i];
            }
        }
        System.out.println(max);
    }

    @Override
    public String toString() {
        return "Highway{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
