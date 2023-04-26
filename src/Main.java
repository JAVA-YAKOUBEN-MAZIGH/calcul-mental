import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcul calcul = new Calcul();
        askNumber(calcul);
    }

    public static void askNumber(Calcul calcul) {
        System.out.println(calcul.getA() + " x " + calcul.getB() + " " + calcul.getResult());
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();

       try {
           if (Integer.parseInt(response) == calcul.getResult()) {
               System.out.println("Go Next");
               calcul = new Calcul();
               askNumber(calcul);
           } else {
               System.out.println("Retry");
               askNumber(calcul);
           }
       } catch (NumberFormatException e) {

           if (response.toLowerCase().contains("stop")) {
               System.out.println("Bye !");
               System.exit(0);
           }

           askNumber(calcul);
       }
    }
}