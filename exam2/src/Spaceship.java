import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double astronaftsHeight = Double.parseDouble(scanner.nextLine());

        double obemRaketa = width * length * height;
        double obemOneRoom = (astronaftsHeight + 0.40) * 2 * 2;
        double spaceFor = Math.floor(obemRaketa / obemOneRoom);
        if (spaceFor >= 3 && spaceFor <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts." , spaceFor);
        }else if (spaceFor < 3){
            System.out.println("The spacecraft is too small.");
        }else if (spaceFor > 10){
            System.out.println("The spacecraft is too big.");
        }
    }
}
