package ru.frechman.exercises.stepik;

public class m3_3_12 {

    class Robot {

        public Direction getDirection() {
            // текущее направление взгляда
            return null;
        }

        public int getX() {
            // текущая координата X
            return 0;
        }

        public int getY() {
            // текущая координата Y
            return 0;
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        int dx = toX - robot.getX();
        int dy = toY - robot.getY();

        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                robot.turnLeft();
            case RIGHT:
                break;
        }

        if (dx > 0) {
            for (int i = 0; i < Math.abs(dx); i++) {
                robot.stepForward();
            }
        } else if (dx < 0) {
            robot.turnRight();
            robot.turnRight();
            for (int i = 0; i < Math.abs(dx); i++) {
                robot.stepForward();
            }
            robot.turnRight();
            robot.turnRight();
        }

        robot.turnLeft();

        if (dy > 0) {
            for (int i = 0; i < Math.abs(dy); i++) {
                robot.stepForward();
            }
        } else if (dy < 0) {
            robot.turnLeft();
            robot.turnLeft();

            for (int i = 0; i < Math.abs(dy); i++) {
                robot.stepForward();
            }
        }
    }

}
