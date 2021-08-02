public class N1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        boolean t = a < 0;
        if (a > 0)
            System.out.println("число положительное");
        else if (a < 0)
            System.out.println("число отрицательное");
        else
            System.out.println("число равно 0");

        switch ((Math.abs(Integer.parseInt(args[0])) + "").length()){
            case 1:
                System.out.println("число однозначное");
                break;
            case 2:
                System.out.println("число двухзначное");
                break;
            case 3:
                System.out.println("число трёхзначное");
                break;
        }
    }
}
