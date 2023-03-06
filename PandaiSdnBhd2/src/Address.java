public class Address {
    String buildingNo;
    String district;
    String state;
    String postcode;
    String street;

    public Address(String buildingNo, String street, String district, String state, String postcode){
        this.street = street;
        this.buildingNo = buildingNo;
        this.district = district;
        this.state = state;
        this.postcode = postcode;
    }

}
