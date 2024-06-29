package lt.techin.ovidijus;

import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PhilatelistBaseTest;

public class PhilateslistTest  extends PhilatelistBaseTest {
    @Override
    protected Philatelist getPhilatelist() {
        Philatelist ph = new PhilatelistImpl();
        return ph;
    }
}

