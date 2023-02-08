public class CanYouVote {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age < 18) 
            System.out.println("Can't vote");
        else {
            if (age > 120)
                System.out.println("age exceeded the limit");
            else
            System.out.println("Can vote");
        }
    }
}