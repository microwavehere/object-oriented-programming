public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Tính Delta
    public double tinhDelta() {
        return b * b - 4 * a * c;
    }

    public void giai() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình bậc nhất có nghiệm x = " + x);
            }
            return;
        }

        double delta = tinhDelta();
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm (Delta < 0).");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== THỬ NGHIỆM PHƯƠNG TRÌNH BẬC 2 ===");
        
        PhuongTrinhBac2 pt1 = new PhuongTrinhBac2(2, -5, 2);
        System.out.println("Phương trình 1: 2x^2 - 5x + 2 = 0");
        pt1.giai();

        System.out.println("--------------------------------");

        PhuongTrinhBac2 pt2 = new PhuongTrinhBac2(1, -2, 1);
        System.out.println("Phương trình 2: x^2 - 2x + 1 = 0");
        pt2.giai();
    }
}