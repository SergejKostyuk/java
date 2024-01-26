import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {

        System.out.print("Представьтесь, пожалуйста: ");
        Scanner scanner = new Scanner(System.in, "ibm866");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        scanner.close();
    }
}