package Root_classificatin.Root_classificatin;

enum Root_Types {
    No_roots,
    Not_quadratic,
    Equal_roots,
    Two_roots,
    ERROR
}

public class Roots {

    private static Root_Types roots;

    private static boolean out_of_Range(double x, double a, double b) {
        return (x < a || x > b);
    }

    public static void calculate_roots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (out_of_Range(a, 0, 20) || out_of_Range(b, 0, 20) || out_of_Range(c, 0, 40)) {
            roots = Root_Types.ERROR;
            return;
        }

        if (a == 0) {
            roots = Root_Types.Not_quadratic;
        } else {
            if (discriminant > 0) {
                roots = Root_Types.Two_roots;
            } else if (discriminant == 0) {
                roots = Root_Types.Equal_roots;
            } else {
                roots = Root_Types.No_roots;
            }
        }
    }

    public static Root_Types getRootTypes() {
        return roots;
    }
}