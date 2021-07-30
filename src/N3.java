public class N3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a > 0) a++;
        else if (a < 0) a -= 2;
        else a = 10;
        System.out.println(a);
    }
}
