package ie.atu.productv5;



public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           ie.atu.productv5.Book myBook = new ie.atu.productv5.Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            ie.atu.productv5.Book myBook = new ie.atu.productv5.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            ie.atu.productv5.Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if(productCode.equalsIgnoreCase("PINK")){
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here by Pink Floyd");
            myMusic.setPrice(8.50);
            myMusic.setLabel("Columbia group");
            myMusic.setArtist("Pink Floyd");
            p = myMusic;
        } else if(productCode.equalsIgnoreCase("WEEKND")){
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Low Life by The Weeknd");
            myMusic.setPrice(9.50);
            myMusic.setLabel("Eagle Production");
            myMusic.setArtist("The Weeknd");
            p = myMusic;
        } else if(productCode.equalsIgnoreCase("CEE")){
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Loading by Central Cee");
            myMusic.setPrice(10.50);
            myMusic.setLabel("GRM Daily");
            myMusic.setArtist("Central Cee");
            p = myMusic;
        }

        if(productCode.equalsIgnoreCase("lg001")){
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("LG 4k Smart Tv");
            myTV.setPrice(895.50);
            myTV.setManufucture("LG");
            myTV.setScreenSize("Screen size is 50");
            p = myTV;
        } else if(productCode.equalsIgnoreCase("kdl43")){
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(1900.00);
            myTV.setManufucture("SONY");
            myTV.setScreenSize("Screen size is 82");
            p = myTV;
        }
        return p;
    }
}

