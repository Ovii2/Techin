package farmsimulator;

import java.util.Collection;
import java.util.Locale;

public class CowHouse {
    private BulkTank bulkTank = null;
    private MilkingRobot robot = null;

    public CowHouse(BulkTank tank) {
        this.bulkTank = tank;
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        milkingRobot.setBulkTank(bulkTank);
        robot = milkingRobot;
    }

    public void takeCareOf(Cow cow) {
        if (robot == null) {
            throw new IllegalStateException();
        }
        robot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (robot == null) {
            throw new IllegalStateException();
        }
        for (Cow c : cows) {
            robot.milk(c);
        }
    }

    @Override
    public String toString() {
        return bulkTank.toString();
    }
}
