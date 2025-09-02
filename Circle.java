class Circle {
    public static void main(String[] args) {
        // Constants
        final double Pi = 3.1415;
        final double radius = 10.25;

        // Calculated variables
        double diameter;
        double circumference;
        double areaOfCircle;
        double areaOfSemicircle;

        // Math
        diameter = radius * 2;
        circumference = 2 * Pi * radius;
        areaOfCircle = Pi * (radius * radius);
        areaOfSemicircle = 0.5 * areaOfCircle;

        // Output
        
        // Properties of a Circle
        System.out.println("Properties of a Circle");
        System.out.println("Radius             : " + radius);
        System.out.println("Diameter           : " + diameter);
        System.out.println("Circumference      : " + circumference);
        System.out.println("Area               : " + areaOfCircle);
        System.out.println("Area of Semicircle : " + areaOfSemicircle);

        // Properties Rounded Down
        System.out.println();
        System.out.println("Properties \"Rounded\" Down");
        System.out.println("Radius             : " + (int) radius);
        System.out.println("Diameter           : " + (int) diameter);
        System.out.println("Circumference      : " + (int) circumference);
        System.out.println("Area               : " + (int) areaOfCircle);
        System.out.println("Area of Semicircle : " + (int) areaOfSemicircle);
    }
}
