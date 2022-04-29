import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0.0;
        double priceApartment = 0.0;


        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50.00;
            priceApartment = 65.00;
            if (night > 7 && night < 14) {
                priceStudio = priceStudio - priceStudio * 0.05;
            }  if (night > 14) {
                priceStudio = priceStudio - priceStudio * 0.30;
                priceApartment = priceApartment - priceApartment * 0.10;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;
            if (night > 14) {
                priceStudio = priceStudio - priceStudio * 0.20;
                priceApartment = priceApartment - priceApartment * 0.10;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76.00;
            priceApartment = 77.00;
            if (night > 14) {
                priceApartment = priceApartment - priceApartment * 0.10;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment * night);
        System.out.printf("Studio: %.2f lv.", priceStudio * night);


    }
}
