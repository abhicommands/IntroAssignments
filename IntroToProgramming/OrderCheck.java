public class OrderCheck {
    public static void main(String[] args) {
        boolean finalBool = true;
        if(Integer.parseInt(args[0]) > Integer.parseInt(args[1])) {
            for(int i = 1; i < 4; i++) {
                if(Integer.parseInt(args[i-1]) < Integer.parseInt(args[i])){
                    finalBool = false;
                    break;
                }
                    
            }
        } else if(Integer.parseInt(args[0]) < Integer.parseInt(args[1])) {
            for(int i = 1; i < 4; i++) {
                if(Integer.parseInt(args[i-1]) > Integer.parseInt(args[i])){
                    finalBool = false;
                    break;
                }
            }
        } else {
            finalBool = false;
        }
        System.out.println(finalBool);
    }
}
