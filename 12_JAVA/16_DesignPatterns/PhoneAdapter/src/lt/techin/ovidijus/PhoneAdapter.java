package lt.techin.ovidijus;


import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class PhoneAdapter implements Phone {

    private AutomaticDialer automaticDialer;


    public PhoneAdapter(AutomaticDialer automaticDialer) {
        this.automaticDialer = automaticDialer;
    }

    @Override
    public void dial(String s) {
//        Phone p1 = new MyPhone(s);
//        automaticDialer.dial(p1);
//        MobilePhone p1 = new MobilePhone();
//        p1.dial(s);
//        automaticDialer.dial(p1);

    }

    @Override
    public String getReponse() {
        return "hello from phone";

    }
}
