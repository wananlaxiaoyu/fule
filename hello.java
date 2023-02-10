
public class hello {
    public static void main(String[] args) {
        int[] x = {10, 20, 30};
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            //System.out.println(x[i]);
             y[i] = x[i];
            System.out.println();
            //System.out.println(y[i]);
            y[1] = 100;
            System.out.println(y[i]);
        }
    }
}

