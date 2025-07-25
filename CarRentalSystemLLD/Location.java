package CarRentalSystemLLD;

public class Location {
    private String City;
    private String address;
    private String pinCode;

    public Location(String city, String address, String pinCode) {
        City = city;
        this.address = address;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
