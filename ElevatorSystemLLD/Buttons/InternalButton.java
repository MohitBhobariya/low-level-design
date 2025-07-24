package ElevatorSystemLLD.Buttons;

import ElevatorSystemLLD.Dispatcher.InternalDispatcher;
import ElevatorSystemLLD.Elevator;

public class InternalButton {
    private final int[] buttons = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private InternalDispatcher internalDispatcher = new InternalDispatcher();

    public void pressButton(int destination, Elevator elevator) {
        internalDispatcher.submitInternalRequest(destination, elevator);
    }
}
