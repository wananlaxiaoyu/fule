public class OverLoad01 {
    public static void main(String[] args) {


        ma mc = new ma();
        System.out.println(mc.DS(2, 3));
    }
}
        class ma {
            public int DS(int x, int y) {
                return x + y;
            }

            public double DS(double x, int y) {
                return x + y;
            }

            public double DS(int z, double s) {
                return z + s;
            }

        }
