public class N6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a > b) System.out.println("a > b");
        else if (b > a) System.out.println("b > a");
        else System.out.println("a == b");
    }
}
