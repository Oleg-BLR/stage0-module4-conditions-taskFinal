package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public static void main(String[] args) {
        validate(3,4,5);
        validate(0,4,5);
        validate(-3,4,5);
        validate(10,4,5);
    }
    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
        } else if (firstSide + secondSide < thirdSide ||
                   firstSide + thirdSide < secondSide ||
                   secondSide + thirdSide < firstSide) {
            System.out.println("it's not a triangle");
        } else {
            System.out.println("this is a valid triangle");
        }
    }
}
