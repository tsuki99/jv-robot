package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        changeDirection(true, robot.getX(), toX, robot);
        moveToTargetX(robot, toX);
        changeDirection(false, robot.getY(), toY, robot);
        moveToTargetY(robot, toY);
    }

    private void changeDirection(boolean forX, int currentPos, int target, Robot robot) {
        Direction trueDirection;
        if (currentPos >= target) {
            trueDirection = forX ? Direction.LEFT : Direction.DOWN;
        } else {
            trueDirection = forX ? Direction.RIGHT : Direction.UP;
        }

        do {
            robot.turnLeft();
        } while (!robot.getDirection().equals(trueDirection));
    }

    private void moveToTargetX(Robot robot, int target) {
        do {
            robot.stepForward();
        } while (robot.getX() != target);
    }

    private void moveToTargetY(Robot robot, int target) {
        do {
            robot.stepForward();
        } while (robot.getY() != target);
    }
}
