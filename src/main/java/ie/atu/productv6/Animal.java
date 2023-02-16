package ie.atu.productv6;

public class Animal extends Product{
    private String type;
    private int age ;
    private String breed;
    private double price;


    public Animal() {
        this.type = "";
        this.age = 0;
        this.breed = "";
        this.price = 0;
    }

    public Animal(String type, int age, String breed, double price) {
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }
}
