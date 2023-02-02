package ie.atu.productv5;

public class TV extends Product{

    private String Manufucture;
    private String ScreenSize;

    public TV (){
        super();
        Manufucture = "";
        ScreenSize = "";
        count++;
    }

    public String getManufucture() {
        return Manufucture;
    }

    public void setManufucture(String manufucture) {
        Manufucture = manufucture;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    @Override
    public String toString() { return super.toString() + " by " + Manufucture + "\n" + ScreenSize + "\"";
    }
}
