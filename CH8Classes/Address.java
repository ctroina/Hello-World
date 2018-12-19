package CH8Classes;
//This bank is only for 'Merica
public class Address {
    private int houseNumber;
    private int aptNum;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String country;

    public Address(int houseNumber, String street, String city, String state, int zip, String country) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = "United States";
    }

    public Address(int houseNumber, int aptNum, String street, String city, String state, int zip, String country) {
        this.houseNumber = houseNumber;
        this.aptNum = aptNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = "United States";
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getAptNum() {
        return aptNum;
    }

    public void setAptNum(int aptNum) {
        this.aptNum = aptNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = "United States";
    }
    public String toString(){
        return houseNumber+" "+street+", "+city+", "+state+", "+country+", "+zip;
    }
}
