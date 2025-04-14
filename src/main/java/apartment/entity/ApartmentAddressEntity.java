package apartment.entity;

public class ApartmentAddressEntity {
    private int id;
    private int accountId;
    private int cityId;
    private String street;
    private String house;
    private String flatNumber;

    public int getId() {
        return id;
    }

    public ApartmentAddressEntity setId(int id) {
        this.id = id;
        return this;
    }

    public int getAccountId() {
        return accountId;
    }

    public ApartmentAddressEntity setAccountId(int accountId) {
        this.accountId = accountId;
        return this;
    }

    public int getCityId() {
        return cityId;
    }

    public ApartmentAddressEntity setCityId(int cityId) {
        this.cityId = cityId;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public ApartmentAddressEntity setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getHouse() {
        return house;
    }

    public ApartmentAddressEntity setHouse(String house) {
        this.house = house;
        return this;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public ApartmentAddressEntity setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
        return this;
    }
}
