import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //     Група до 5 човека – изкачват Мусала
        //     Група от 6 до 12 човека – изкачват Монблан
        //     Група от 13 до 25 човека – изкачват Килиманджаро
        //     Група от 26 до 40 човека – изкачват К2
        //     Група от 41 или повече човека – изкачват Еверест

        int musala = 0;
        int monblan = 0;
        int kalimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 5) {
                musala = musala + number;
                sum = sum + number;
            } else if (number <= 12) {
                monblan = monblan + number;
                sum = sum + number;
            } else if (number <= 25) {
                kalimandjaro = kalimandjaro + number;
                sum = sum + number;
            } else if (number <= 40) {
                k2 = k2 + number;
                sum += number;
            } else {
                everest = everest + number;
                sum = sum + number;

            }

        }
        System.out.printf("%.2f%%%n", musala * 1.0 / sum * 100);
        System.out.printf("%.2f%%%n", monblan * 1.0 / sum * 100);
        System.out.printf("%.2f%%%n", kalimandjaro * 1.0 / sum * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / sum * 100);
        System.out.printf("%.2f%%%n", everest * 1.0 / sum * 100);


    }
}
