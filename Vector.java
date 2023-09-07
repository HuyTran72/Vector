public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector (double xcoord, double ycoord, double zcoord) {
        this.x = xcoord;
        this.y = ycoord;
        this.z = zcoord;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector add(Vector v) {
        this.x += v.getX();
        this.y += v.getY();
        this.z += v.getZ();
        return this;
    }

    public double dotProduct(Vector v) {
        return this.x * v.getX() + this.y * v.getY() + this.z * v.getZ();
    }

    public double computeMagnitude () {
        double sumOfSquares = Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2);
        double result = Math.sqrt(sumOfSquares);
        return result;
    }

    public void normalize() {
        double magnitude = computeMagnitude();
        if (magnitude != 0) {
            this.x /= magnitude;
            this.y /= magnitude;
            this.z /= magnitude;
        }
    }

    public Vector scaleVector(double factor) {
        this.x *= factor;
        this.y *= factor;
        this.z *= factor;
        return this;
    }
}
