package ElevatorSystemLLD;

import ElevatorSystemLLD.Enums.Direction;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ElevatorManager {
    private Elevator elevator;
    private PriorityQueue<Integer> maxDown;
    private PriorityQueue<Integer> minUp;

    public ElevatorManager(Elevator elevator) {
        this.elevator = elevator;
        maxDown = new PriorityQueue<>(); // when lift come down
        minUp = new PriorityQueue<>(Collections.reverseOrder()); // when lift goes up
    }

    public Elevator getElevator() {
        return elevator;
    }

    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }

    public void submitExternalRequest(int floor, Direction direction) {

        if (direction == Direction.DOWN) {
            maxDown.offer(floor);
        } else {
            minUp.offer(floor);
        }
    }

    public void submitInternalRequest(int floor) {

    }

    public void controlElevator() {
        while (true) {

            if (elevator.getDirection() == Direction.UP) {


            }
        }
    }
}
