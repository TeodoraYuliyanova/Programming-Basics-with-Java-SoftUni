import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        for (int floors = countFloors; floors > 0; floors--) {
            for (int rooms = 0; rooms < countRooms; rooms++) {
                //posleden etaj -> 'L' {nomer na etaj} {nomer na staq}
                //ako e cheten -> 'O' {nomer na etaj} {nomer na staq}
                // ako e ne cheten -> 'A'{nomer na etaj} {nomer na staq}
                if (floors == countFloors) {
                    System.out.print("L" + floors + rooms + " ");
                } else if (floors % 2 == 0) {
                    System.out.print("O" + floors + rooms + " ");
                } else {
                    System.out.print("A" + floors + rooms + " ");
                }
            }
            System.out.println();
        }
    }
}

