package lt.techin.ovidijus;

import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class MyPhone implements Phone {
    private String phoneNumber;


    public MyPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void dial(String s) {
        System.out.printf("Dialing to %s from %s %s%n", s, this.getClass().getSimpleName(), phoneNumber);
    }

    @Override
    public String getReponse() {
        return "response";

    }
}
