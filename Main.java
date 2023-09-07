public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        System.out.println("Value of vector 1 are: ");
        System.out.println("x => %f, y => %f, z => %f\n", v1.getX(), v1.getY(), v1.getZ());
        System.out.println("Magnitude of vector 1: %f\n", v1.computeMagnitude());

        System.out.println();

        System.out.println("Values of vector 2 are: ");
        System.out.printf("x=> %f, y=> %f, z=> %f\n", v2.getX(), v2.getY(), v2.getZ());
        System.out.printf("Magnitude of vector 2: %f\n", v2.computeMagnitude());

        System.out.println();

        System.out.println("Adding vector 2 to vector 1...");
        v1.add(v2);
        System.out.println("Values of vector 1 are: ");
        System.out.printf("x=> %f, y=> %f, z=> %f\n", v1.getX(), v1.getY(), v1.getZ());
        System.out.printf("Magnitude of vector 1: %f\n", v1.computeMagnitude());

        System.out.println();

        System.out.println("Normalising vector 2...");
        v2.normalize();
        System.out.println("Values of vector 2 are: ");
        System.out.printf("x=> %f, y=> %f, z=> %f\n", v2.getX(), v2.getY(), v2.getZ());
        System.out.printf("Magnitude of vector 2: %f\n", v2.computeMagnitude());

        System.out.println();

        System.out.println("Scaling vector 2 by 5.4");
        v2.scaleVector(5.4);
        System.out.println("Values of vector 2 are: ");
        System.out.printf("x=> %f, y=> %f, z=> %f\n", v2.getX(), v2.getY(), v2.getZ());
        System.out.printf("Magnitude of vector 2: %f\n", v2.computeMagnitude());

        System.out.println();

        System.out.println("Dot product of vector 1 and vector 2:");
        System.out.println(v1.dotProduct(v2));
    }
}
