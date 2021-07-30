public class N2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int y = 0;
        if (a + b <= c) y++;
        if (c + b <= a) y++;
        if (a + c <= b) y++;
        if (y > 0){
            System.out.println("такого треугольника не существует");
        }else{
            System.out.println("такой треугольник существует");
        }
    }
}
