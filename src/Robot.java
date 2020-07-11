public class Robot {
    public Robot(int id) {
        this.id = id;
        this.paths = new double[]{0.0, 0.0};
        }


    private int id;
    private String type;
    private double speed;
    private int dimensions = 0; //default value


    public double currentXPosition;
    public double currentYPosition;
    public double currentZPosition;
    //set as one coordinate object

    public double[] paths;

    //set paths
    public void setPaths(double x, double y) {
        this.paths = ArraysPractise.insertIn(y,0, paths);
        this.paths = ArraysPractise.insertIn(x,0, paths);
    }

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

    //print
    public void print() {
        System.out.println("Robot #" + this.id + " \n Type: " + this.getType() + "\n Speed: "
                + this.getSpeed() + "\n");
    }
}
