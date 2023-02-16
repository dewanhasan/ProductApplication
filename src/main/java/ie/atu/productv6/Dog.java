package ie.atu.productv6;

public class Dog extends Animal {
    private String vaccination;
    private String shredding;
    private String neutered;

    public Dog() {
        super();
        vaccination = "";
        shredding = "";
        neutered = "";
    }

    public Dog(String vaccination, String shredding, String neutered) {
        this.vaccination = vaccination;
        this.shredding = shredding;
        this.neutered = neutered;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getShredding() {
        return shredding;
    }

    public void setShredding(String shredding) {
        this.shredding = shredding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "vaccination='" + vaccination + '\'' +
                ", shredding='" + shredding + '\'' +
                ", neutered='" + neutered + '\'' +
                '}';
    }
}
