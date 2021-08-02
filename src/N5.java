public class N5 {
    public static void main(String[] args) {
        int[] a = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};
        int y = 0;
        int x = 0;
        for (Integer b : a) {
            if (b > 0) y++;
            else if (b < 0) x++;
        }
        System.out.println("положительные " + y);
        System.out.println("отрицательные " +  x);
    }
}
