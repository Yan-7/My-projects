public class Test {
    public static void main(String[] args) {

        Car car1 = new SportCar();
        Car car2 = new SportCar();
        Car car3 = new SportCar();

        Car car4 = new FamilyCar();
        Car car5 = new FamilyCar();
        Car car6 = new FamilyCar();
        Car car7 = new FamilyCar();

        Car[] cars1 = {car1,car2,car3};
        Car[] cars2 = {car4,car5,car6,car7};

        Highway highway1 = new Highway("high1",cars1);
        Highway highway2 = new Highway("high2",cars2);
        Highway[] highways = {highway1,highway2};
        Country country1 = new Country(highways,"Jordan");


        Country.highwaysCapacity(country1.highways);
        Country.busiest(country1.highways);
        Country.fastestHighway(country1.highways);






    }
}
