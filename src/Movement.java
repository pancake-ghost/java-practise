public class Movement {
    static double originalXPosition = 0.0;
    static double originalYPosition = 0.0;
    static double originalZPosition = 0.0;

    private double xAxis;
    private double yAxis;
    private double zAxis;

    private double directionAngle;
    private double directionAngleVertical;


    //set direction angle
    public void setDirectionAngle(double robotDirectionAngle) {
        this.directionAngle = robotDirectionAngle;
    }

    //setting vertical direction angle
    public void setDirectionAngleVertical(double robotDirectionAngleVertical) {
        this.directionAngleVertical = robotDirectionAngleVertical;
    }

    //set Position
    public void setCoordinates(double speed, double directionAngle, double directionAngleVertical) {
        this.xAxis = originalXPosition + speed * Math.cos(Math.toRadians(directionAngle));
        this.yAxis = originalYPosition + speed * Math.sin(Math.toRadians(directionAngle));
        this.zAxis = originalZPosition + speed * Math.sin(Math.toRadians(directionAngleVertical));
    }

    //get direction angle
    public double getDirectionAngle() {
        return directionAngle;
    }


    //get vertical direction angle
    public double getDirectionAngleVertical() {
        return directionAngleVertical;
    }


    //get x-axis coordinate
    public double getXAxis() {
        return xAxis;
    }

    //get y-axis coordinate
    public double getYAxis() {
        return yAxis;
    }

    //get z-axis coordinate
    public double getZAxis() {
        return zAxis;
    }
}
