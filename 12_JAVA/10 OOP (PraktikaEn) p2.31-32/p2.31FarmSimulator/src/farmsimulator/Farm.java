package farmsimulator;

import java.util.ArrayList;

public class Farm implements Alive {

    private String owner;
    private CowHouse cowHouse;
    private ArrayList<Cow> cows = new ArrayList<>();

    public Farm(String owner, CowHouse cowHouse) {
        this.owner = owner;
        this.cowHouse = cowHouse;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void liveHour() {
        cows.forEach(Cow::liveHour);
    }

    public void manageCows() {
        cowHouse.takeCareOf(cows);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        cowHouse.installMilkingRobot(robot);
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }
}
