/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in); 
        System.out.println("What is your name? ");
        String name = in.nextLine();
        if (name.equals("Alice") || name.equals("Bob")){
            System.out.print("Greetings " + name);
        }    
        

    }
}
