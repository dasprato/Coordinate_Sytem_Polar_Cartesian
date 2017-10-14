public class PolarCoordinate {

    private int r;
    private int theta;

    PolarCoordinate () {
        this.r = 0;
        this.theta = 0;
    }

    PolarCoordinate(int r, int theta) {
        this.r = r;
        this.theta = theta;
    }

    public int getR() {
        return this.r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getTheta() {
        return theta;
    }

    public void theta(int theta) {
        this.theta = theta;
    }
}
