public class N7 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        switch (args[0].charAt(args[0].length() - 1)){
            case '1':
                System.out.println(a + " программист");
                break;
            case '2':
            case '3':
            case '4':
                if (args[0].length() > 1 && args[0].charAt(args[0].length() - 2) == '1')
                    System.out.println(a + " программистов");
                else
                    System.out.println(a + " программиста");
                break;
            default:
                System.out.println(a + " программистов");
        }
    }
}
