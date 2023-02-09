import java.util.Arrays;

public class Country {

    String name;
    Highway[] highways;

    public Country(Highway[] highways,String name) {
        this.name = name;
        this.highways = highways;
    }

    public Highway[] getHighways() {
        return highways;
    }

    public void setHighways(Highway[] highways) {
        this.highways = highways;
    }

    public static void highwaysCapacity(Highway[] highways) {
        int carsCounter = 0;
        for (Highway h: highways) {
            carsCounter+= h.getCars().length;
        }
        System.out.println("num of cars in country: " + carsCounter);

    }

    public static void busiest (Highway[] highways) {
        int busiest = 0;
        String busy = null;
        for (Highway h: highways) {
            if (h.cars.length>busiest) {
                busiest = h.cars.length;
                busy = h.name;
            }
        }
        System.out.println("busy road is: " + busy);

    }
    public static void fastestHighway(Highway[] highways) {
        int speed =0;
        String fastest = null;
        for (Highway highway: highways) {
            if (highway.avgSpeed()>speed) {
                fastest = highway.name;
                speed =highway.avgSpeed();
            }
        }
        System.out.println(("fastest: "+fastest));
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", highways=" + Arrays.toString(highways) +
                '}';
    }
}
