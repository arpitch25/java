class polynomial {
    double a, b, c;
    polynomial() {
        a = 1;
        b = 0;
        c = 0;
    }   
    polynomial (double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    void root() {
        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("not a quadratic equation");
        }
        else {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root 1st = " + r1);
            System.out.println("Root 2nd = " + r2);
        }

    }

    public static void main(String[] args) {

        polynomial p1 = new polynomial();
        p1.root();
        polynomial p2 = new polynomial(1, -5, 6);
        p2.root();
    }
}
