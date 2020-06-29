import java.util.Scanner;

/** Program with a choice of 3 different robots
 * that move in different dimensions
 * depending on the input value of direction angles
 *
 * @author pancake ghost
 */


public class Main {
    public static void main(String[] args) {

        //Setting up scanner
        Scanner scan = new Scanner(System.in);

        //ROBOT #1
        Robot basicRobot = new Robot();
        basicRobot.setType("basic");
        basicRobot.setSpeed(1.0);
        basicRobot.setDimensions(2);

        basicRobot.setCurrentXPosition(0.0);
        basicRobot.setCurrentYPosition(0.0);

        //ROBOT #2 - DRONE
        Robot drone = new Robot();
        drone.setType("Drone");
        drone.setSpeed(5.0);
        drone.setDimensions(3);

        drone.setCurrentXPosition(0.0);
        drone.setCurrentYPosition(0.0);
        drone.setCurrentZPosition(0.0);

        //ROBOT #3 - CLEANER ROBOT
        Robot cleanerRobot = new Robot();
        cleanerRobot.setType("Vacuum Cleaner Robot");
        cleanerRobot.setSpeed(0.5);
        cleanerRobot.setDimensions(2);

        cleanerRobot.setCurrentXPosition(0.0);
        cleanerRobot.setCurrentYPosition(0.0);


        //PRINTING OUT ROBOTS INFO
        System.out.println("Robot #1 \n Type: " + basicRobot.getType() + "\n Speed: "
                    + basicRobot.getSpeed() + "\n");

        System.out.println("Robot #2 \n Type: " + drone.getType() + "\n Speed: "
                    + drone.getSpeed() + "\n");


        System.out.println("Robot #3 \n Type: " + cleanerRobot.getType() + "\n Speed: "
                            + basicRobot.getSpeed() + "\n");




        //initialising local variables
        boolean run = true;
        boolean move = true;
        double currentXCoordinates = 0.0;
        double currentYCoordinates = 0.0;
        double currentZCoordinates = 0.0;
        double currentSpeed = 0.0;

        //setting movement instance
        Movement robotMovement = new Movement();
        robotMovement.setDirectionAngle(0.0);
        robotMovement.setCoordinates(0.0, 0.0, 0.0);

        //CHOOSING THE ROBOT
        while(run) {
            System.out.println("Choose your robot 1/2/3  or  0 to exit\n");
            int robotChoice = scan.nextInt();

            //printing robot options + setting movements
            if(robotChoice == 1) {
                System.out.println("Robot #1");
                currentSpeed = basicRobot.getSpeed();
                currentXCoordinates = basicRobot.currentXPosition;
                currentYCoordinates = basicRobot.currentYPosition;
                System.out.println(" Moving in: " + basicRobot.getDimensions() + " dimensional space\n Angle of direction: not set\n Current position: ["
                        + currentXCoordinates + ", " + currentYCoordinates +"]\n");
            } else if(robotChoice == 2) {
                System.out.println("Robot #2");
                currentSpeed = drone.getSpeed();
                currentXCoordinates = drone.currentXPosition;
                currentYCoordinates = drone.currentYPosition;
                currentZCoordinates = drone.currentZPosition;
                System.out.println(" Moving in: " + drone.getDimensions() + " dimensional space\n Angle of direction: not set\n Current position: ["
                        + currentXCoordinates + ", " + currentYCoordinates + ", " + currentZCoordinates +"]\n");
            } else if(robotChoice == 3) {
                System.out.println("Robot #3");
                currentSpeed = cleanerRobot.getSpeed();
                currentXCoordinates = cleanerRobot.currentXPosition;
                currentYCoordinates = cleanerRobot.currentYPosition;
                System.out.println(" Moving in: " + cleanerRobot.getDimensions() + " dimensional space\n Angle of direction: not set\n Current position: ["
                        + currentXCoordinates + ", " + currentYCoordinates +"]\n");
            } else if(robotChoice == 0){ //escape
                break;
            } else {
                System.out.println("Invalid input");
            }


            //MOVING THE ROBOT
            System.out.println("Start moving");

            while(move) {
                //getting the angle
                System.out.println("Angle of direction in degrees:");
                double angle = scan.nextDouble();
                robotMovement.setDirectionAngle(angle);

                //getting vertical angle
                if(robotChoice == 2) {
                    System.out.println("Angle of vertical direction in degrees:");
                    double angleVertical = scan.nextDouble();
                    robotMovement.setDirectionAngleVertical(angleVertical);
                }

                //setting coordinates
                robotMovement.setCoordinates(currentSpeed, robotMovement.getDirectionAngle(), robotMovement.getDirectionAngleVertical());
                currentXCoordinates = currentXCoordinates + robotMovement.getXAxis();
                currentYCoordinates = currentYCoordinates + robotMovement.getYAxis();
                currentZCoordinates = currentZCoordinates + robotMovement.getZAxis();

                //printing out current coordinates
                if (robotChoice == 2) {
                    System.out.println("Current position: [" + currentXCoordinates + ", " + currentYCoordinates
                            + ", " + currentZCoordinates + "]" );
                }else {
                    System.out.print("Current position: [" + currentXCoordinates + ", " + currentYCoordinates + "]" );
                }

                //checking for the end programme
                System.out.println("Continue? y/n");
                String shutter = scan.next();
                if (shutter.equals("n")) {
                    if(robotChoice == 1) {
                        basicRobot.currentXPosition = currentXCoordinates;
                        basicRobot.currentYPosition = currentYCoordinates;
                    } else if(robotChoice == 2) {
                        drone.currentXPosition = currentXCoordinates;
                        drone.currentYPosition = currentYCoordinates;
                        drone.currentZPosition = currentZCoordinates;
                    } else if(robotChoice == 3) {
                        cleanerRobot.currentXPosition = currentXCoordinates;
                        cleanerRobot.currentYPosition = currentYCoordinates;
                    }
                    currentXCoordinates = 0.0;
                    currentYCoordinates = 0.0;
                    currentZCoordinates = 0.0;
                    break;
                }
            }

        }

    }

}

//todo: make 3rd dimension for the drone 