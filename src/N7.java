public class N7 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String s = args[0];
        if (s.length() > 1 && s.charAt(s.length() - 2) == '1'){
            int y = Integer.parseInt(Character.toString(s.charAt(s.length() - 1)));
            if (y >= 1 && y <= 4){
                System.out.println(a + " программистов");
                return;
            }
        }
        switch (s.charAt(s.length() - 1)){
            case '1':
                System.out.println(a + " программист");
                break;
            case '2':
            case '3':
            case '4':
                System.out.println(a + " программиста");
                break;
            default:
                System.out.println(a + " программистов");
        }
    }
}
