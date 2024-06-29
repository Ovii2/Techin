package lt.techin.ovidijus;


import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class MobilePhoneAdapter implements Phone {

    private MobilePhone phone;
    private String response;

    public MobilePhoneAdapter(MobilePhone phone) {
        this.phone = phone;
    }

    @Override
    public void dial(String s) {
        response = phone.dial(s);
    }

    @Override
    public String getReponse() {
        return response;
    }
}
