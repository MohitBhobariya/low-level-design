package ElevatorSystemLLD;

import ElevatorSystemLLD.Buttons.InternalButton;
import ElevatorSystemLLD.Enums.Direction;
import ElevatorSystemLLD.Enums.ElevatorStatus;

public class Elevator {
    private long id;
    private long floor;
    private InternalButton internalButton;
    private Direction direction;
    private ElevatorStatus elevatorStatus;
    private Display display;

    public Elevator() {
        this.floor = 0;
        this.internalButton = new InternalButton();
        this.direction = Direction.UP;
        this.elevatorStatus = ElevatorStatus.IDLE;
        this.display = new Display();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFloor() {
        return floor;
    }

    public void setFloor(long floor) {
        this.floor = floor;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public ElevatorStatus getElevatorStatus() {
        return elevatorStatus;
    }

    public void setElevatorStatus(ElevatorStatus elevatorStatus) {
        this.elevatorStatus = elevatorStatus;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}
