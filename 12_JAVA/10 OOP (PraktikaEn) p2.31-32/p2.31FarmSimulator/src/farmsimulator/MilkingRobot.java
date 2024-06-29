package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank = null;

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void setBulkTank(BulkTank tank) {
        bulkTank = tank;
    }

    public void milk(Milkable milkable) {
        if (bulkTank == null) {
            throw new IllegalStateException("The MilkingRobot\n" +
                    "hasn't been installed");
        }
        bulkTank.addToTank(milkable.milk());
    }
}
