package updation;

public class Mobile {
    String name;
    int ram;
    double price;
    int battery;

    public Mobile(String name, int ram, double price, int battery) {
        this.name = name;
        this.ram = ram;
        this.price = price;
        this.battery = battery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
