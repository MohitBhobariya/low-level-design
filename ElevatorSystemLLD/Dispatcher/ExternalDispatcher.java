package ElevatorSystemLLD.Dispatcher;

import ElevatorSystemLLD.Elevator;
import ElevatorSystemLLD.ElevatorCreator;
import ElevatorSystemLLD.ElevatorManager;
import ElevatorSystemLLD.Enums.Direction;

import java.util.List;

public class ExternalDispatcher {
    List<ElevatorManager> elevatorManagers = ElevatorCreator.elevatorManagerList;

    public void submitExternalRequest(int floor, Direction direction) {
        for (ElevatorManager elevatorManager : elevatorManagers) {
            long elevatorID = elevatorManager.getElevator().getId();
            if (elevatorID % 2 == 1 && floor % 2 == 1) {
                elevatorManager.submitExternalRequest(floor, direction);
            } else if (elevatorID % 2 == 0 && floor % 2 == 0) {
                elevatorManager.submitExternalRequest(floor, direction);

            }
        }
    }
}
