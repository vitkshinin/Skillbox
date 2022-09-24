public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator (int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        while (currentFloor != floor) {
            if (floor < minFloor || floor > maxFloor) {
                System.out.println("Ошибка! Задан неверный этаж, попробуйте снова!");
                return;
            } else if (currentFloor < floor) {
                moveUp();
                System.out.println("Текущий этаж: " + currentFloor);
            } else {
                moveDown();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        }
    }

}