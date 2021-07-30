public class N5 {
    public static void main(String[] args) {
        int[] a = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};
        int y = 0;
        for (Integer b : a) {
            if (b != 0) y++;
        }
        System.out.println(y);
    }
}
