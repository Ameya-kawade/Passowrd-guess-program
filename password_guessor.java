import java.util.Scanner;
import java.util.Random;
public class password_guessor {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Enter the password");
        String password= sc.nextLine();
        String guess_password="";
        for (int i=0;i<password.length();i++) {
                char c='}';
                while (password.charAt(i) != c) {
                    c = (char) (rand.nextInt());
                    if (c == password.charAt(i)) {
                        guess_password += c;
                    }
                }

        }
        System.out.println("The password is : "+guess_password);
    }
}
