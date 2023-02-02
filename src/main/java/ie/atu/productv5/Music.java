package ie.atu.productv5;


public class Music extends Product{

    private String label;
    private String Artist;

    public Music() {
        super();
        label = "";
        Artist = "";
        count++;
    }



    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }


    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getArtist() {
        return Artist;
    }

    @Override
    public String toString() { return super.toString() + "\n" + label + "\nArtist: " + Artist;
    }
}
