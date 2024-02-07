public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int speed1 = 200;
        String name1 = "Avanza";
        int year1 = 2020;
        Car car1 = new Car(speed1, name1, year1);

        car1.driveMaxSpeed();
        car1.printInfo();

        car1.setName("Toyota Avanza");
        car1.setMax_speed(180);
        car1.setYear_of_make(2021);

        System.out.println("Name: "+ car1.getName()
                + ", Year of make: " + car1.getYear_of_make()
                +  ", Max speed: " + car1.getMax_speed());
    }
}