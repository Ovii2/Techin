package lt.techin.ovidijus;

import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class Main {
    public static void main(String[] args) {

        AutomaticDialer automaticDialer = new AutomaticDialer();
        MobilePhone mobile = new MobilePhone();

        Phone mobilePhoneAdapter = new MobilePhoneAdapter(mobile);


        System.out.println(automaticDialer.dial(mobilePhoneAdapter));


    }
}
