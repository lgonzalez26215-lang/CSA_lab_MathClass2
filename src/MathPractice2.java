public class MathPractice2 {

    public static void main(String[] args) {
        // You can test your methods here, e.g.:
        System.out.println("Your coin flip is]" + q4());



        // System.out.println(q1());
        System.out.println("Random Number; " + q1());
    }

    // 1. Generate a random integer between 100 and 200 inclusive.
    public static int q1() {
        // TODO: Implement
        int min = 100;
        int max = 200;

        int range = (max - min ) + 1;
        int randnum = (int) (Math.random() * range + min );
        return randnum;
    }

    // 2. Use Math.min() to return the smaller of two integers.
    public static int q2(int a, int b) {
        // TODO: Implement
        return 0;
    }

    // 3. Use Math.max() to return the largest of three integers.
    public static int q3(int a, int b, int c) {
        // TODO: Implement
        return 0;
    }

    // 4. Simulate flipping a coin (randomly return "Heads" or "Tails").
    public static String q4() {
        // TODO: Implement
        int numerator = (int)Math.random() *  100;
        int results = numerator % 2;
        if (results == 0) {
            return "Heads";
        }else{
            return "Tails";
        }
    }

    // 5. Return the result of rounding 3.14159 to the nearest integer using Math.round().
    public static long q5() {
        // TODO: Implement
        return 0;
    }

    // 6. Return the result of Math.ceil(7.2) and Math.floor(7.2).
    public static double[] q6() {
        // TODO: Implement
        return new double[2];
    }

    // 7. Write a method that returns a random multiple of 5 between 10 and 100.
    public static int q7() {
        // TODO: Implement
        return 0;
    }

    // 8. Return the distance between two points (x1, y1) and (x2, y2) using Math.sqrt().
    public static double q8(int x1, int y1, int x2, int y2) {
        // TODO: Implement
        return 0.0;
    }

    // 9. Simulate a random number between 1 and 10, then square it using Math.pow().
    public static int q9() {
        // TODO: Implement
        return 0;
    }

    // 10. Return the absolute difference between two integers.
    public static int q10(int a, int b) {
        // TODO: Implement
        return 0;
    }
}
