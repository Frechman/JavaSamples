package ru.frechman.exercises.stepik;

public class m4_2_7 {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        //RobotConnection rb = null;
        boolean attemp = false;
        int count = 0;
        while (count < 3 && attemp == false) {
            try (RobotConnection rb = robotConnectionManager.getConnection()) {
                rb.moveRobotTo(toX, toY);
                attemp = true;
            } catch (RobotConnectionException rcE) {
                if (count >= 2) {
                    throw rcE;
                }
                //if (attemp==true){count=3;}

                count++;
            } catch (Throwable t) {
                throw t;
            }
        }
    }

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }


    public class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
