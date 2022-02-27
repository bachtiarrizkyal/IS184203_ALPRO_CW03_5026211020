package processaname5026211020;
import java.util.Scanner;
public class ProcessAName5026211020 {


    public static void main(String[] args) {
    String FirstName, LastName;
        int SpaceIdx;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your First and Last Name :");
        String name = sc.nextLine();
        SpaceIdx = name.indexOf(" ");
        LastName = name.substring(SpaceIdx+1);
        System.out.println("Your name is " +LastName+ ", " +name.charAt(0)+ ".");


    }
}