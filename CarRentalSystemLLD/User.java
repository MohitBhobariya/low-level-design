package CarRentalSystemLLD;

public class User {
    private int id;
    private String name;
    private int licenseNumber;
    private int age;

    public User(int id, String name, int licenseNumber, int age) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.age = age;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
