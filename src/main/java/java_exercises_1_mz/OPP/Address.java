package java_exercises_1_mz.OPP;

import lombok.Getter;
import lombok.Setter;

public class Address {
    @Setter
    @Getter
    private String street, city, country;
    @Setter
    @Getter
    private Integer flatNo, homeNo;

    public Address(String street,String city,String country,Integer flatNo,Integer homeNo) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.flatNo = flatNo;
        this.homeNo = homeNo;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", flatNo=" + flatNo +
                ", homeNo=" + homeNo +
                '}';
    }
}
