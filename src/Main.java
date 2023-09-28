import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String party;

        System.out.print("Please enter your party affiliation(D, R, I, or something else): ");
        party = scan.nextLine();

        if (Objects.equals(party, "D")) {
            System.out.println("You get a democratic donkey");
        } else if (Objects.equals(party, "R")) {
            System.out.println("You get a republican rhino");
        } else {
            System.out.println("You get an independent man");
        }
    }
}