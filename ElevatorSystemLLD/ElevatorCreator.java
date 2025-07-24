package ElevatorSystemLLD;

import java.util.ArrayList;
import java.util.List;


public class ElevatorCreator {

    public static List<ElevatorManager> elevatorManagerList = new ArrayList<>();

    static {

        Elevator elevatorCar1 = new Elevator();
        elevatorCar1.setId(1);
        ElevatorManager elevatorManager1 = new ElevatorManager(elevatorCar1);

        Elevator elevatorCar2 = new Elevator();
        elevatorCar1.setId(2);
        ElevatorManager elevatorManager2 = new ElevatorManager(elevatorCar2);

        elevatorManagerList.add(elevatorManager1);
        elevatorManagerList.add(elevatorManager2);
    }
}
