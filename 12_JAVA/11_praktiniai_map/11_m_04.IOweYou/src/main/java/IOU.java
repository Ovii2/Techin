import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> hm = new HashMap<>();

    public IOU() {
    }

    public void setSum(String toWhom, double amount) {
        hm.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return hm.containsKey(toWhom) ? hm.get(toWhom) : 0;
    }
}
