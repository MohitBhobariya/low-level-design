package ElevatorSystemLLD;

import ElevatorSystemLLD.Enums.Direction;

public class Display {
    private long floor;
    private Direction direction;

    public void setDisplay(long floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void showDisplay() {
        System.out.println(floor);
        System.out.println(direction);
    }

}
