package company;

public class PostInfo {
    private String city;
    private int zipCode;


    public PostInfo(int zipCode, String city) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "PostInfo " + zipCode + " " + city;
    }
}
