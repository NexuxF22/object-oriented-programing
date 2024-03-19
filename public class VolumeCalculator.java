public class VolumeCalculator
    {

    // Method to calculate volume of a cube
    public double calculateVolume(double sideLength)
    {
        return Math.pow(sideLength, 3);
    }

    // Method to calculate volume of a cylinder
    public double calculateVolume(double radius, double height)
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate volume of a box
    public double calculateVolume(double length, double width, double height)
    {
        return length * width * height;
    }

    public static void main(String[] args)
    {
        VolumeCalculator calculator = new VolumeCalculator();

        // Calculating volume of a cube with side length 5
        double cubeVolume = calculator.calculateVolume(5);
        System.out.println("Volume of cube: " + cubeVolume);

        // Calculating volume of a cylinder with radius 3 and height 8
        double cylinderVolume = calculator.calculateVolume(3, 8);
        System.out.println("Volume of cylinder: " + cylinderVolume);

        // Calculating volume of a box with dimensions 4x6x7
        double boxVolume = calculator.calculateVolume(4, 6, 7);
        System.out.println("Volume of box: " + boxVolume);
    }
}
