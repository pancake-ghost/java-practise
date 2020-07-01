public class Robot {
    private String type;
    private double speed;
    private int dimensions = 0; //default value

    public double currentXPosition;
    public double currentYPosition;
    public double currentZPosition;

    public double[] coordinates;

    //setting type
    public void setType(String robotType) {
        this.type = robotType;
    }

    //setting speed
    public void setSpeed(double robotSpeed) {
        this.speed = robotSpeed;
    }

    //setting dimensions
    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    //setting current x position
    public void setCurrentXPosition(double currentX) {
        this.currentXPosition = currentX;
    }

    //setting current y position
    public void setCurrentYPosition(double currentY) {
        this.currentYPosition = currentY;
    }

    //setting current z position
    public void setCurrentZPosition(double currentZ) {
        this.currentZPosition = currentZ;
    }


        // get type
    public String getType() {
        return type;
    }

    //get speed
    public double getSpeed() {
        return speed;
    }

    //get dimensions
    public int getDimensions() {
        return dimensions;
    }

}
