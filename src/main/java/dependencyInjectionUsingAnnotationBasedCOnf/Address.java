package dependencyInjectionUsingAnnotationBasedCOnf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
@Value("56")
    private int houseNo;
@Value("Pune")
    private String city;
@Value("456458")
    private int pincode;

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

//    public Address(int houseNo, String city, int pincode) {
//        this.houseNo = houseNo;
//        this.city = city;
//        this.pincode = pincode;
//    }
        public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        System.out.println("setter method pf setHouseNo");

        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("setter method pf setCity");

        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        System.out.println("setter method pf setPincode");

        this.pincode = pincode;
    }


}
