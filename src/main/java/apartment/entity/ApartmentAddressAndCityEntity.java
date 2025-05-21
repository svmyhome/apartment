package apartment.entity;

public class ApartmentAddressAndCityEntity {
    private int id;
    private int accountId;
    private int cityId;
    private String street;
    private String house;
    private String flatNumber;
    private String city;

    public int getId() {
        return id;
    }

    public ApartmentAddressAndCityEntity setId(int id) {
        this.id = id;
        return this;
    }

    public int getAccountId() {
        return accountId;
    }

    public ApartmentAddressAndCityEntity setAccountId(int accountId) {
        this.accountId = accountId;
        return this;
    }

    public int getCityId() {
        return cityId;
    }

    public ApartmentAddressAndCityEntity setCityId(int cityId) {
        this.cityId = cityId;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public ApartmentAddressAndCityEntity setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getHouse() {
        return house;
    }

    public ApartmentAddressAndCityEntity setHouse(String house) {
        this.house = house;
        return this;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public ApartmentAddressAndCityEntity setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
        return this;
    }

    public String getCity() {
        return city;
    }

    public ApartmentAddressAndCityEntity setCity(String city) {
        this.city = city;
        return this;  // Возвращаем this для fluent-стиля
    }

    @Override
    public String toString() {
        return "ApartmentAddressAndCityEntity{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", cityId=" + cityId +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
