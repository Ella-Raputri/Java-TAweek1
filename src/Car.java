public class Car {
    private int max_speed;
    private String name;
    private int year_of_make;

    public Car (int speed, String name, int year){
        this.max_speed = speed;
        this.name = name;
        this.year_of_make = year;
    }

    public void driveMaxSpeed(){
        System.out.println("Driving with max speed: " + this.max_speed + " km/h");
    }
    public void printInfo(){
        System.out.println("Name: "+ this.name + ", Year of make: " + this.year_of_make);
    }

    //getters
    public int getMax_speed(){
        return this.max_speed;
    }
    public String getName() {
        return name;
    }
    public int getYear_of_make() {
        return year_of_make;
    }


    //setters
    public void setMax_speed(int speed_new){
        this.max_speed = speed_new;
    }
    public void setName(String name_new) {
        this.name = name_new;
    }
    public void setYear_of_make(int year_of_make_new) {
        this.year_of_make = year_of_make_new;
    }
}
