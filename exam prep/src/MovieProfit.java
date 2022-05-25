import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int numberTickets = Integer.parseInt(scanner.nextLine());
        double priceForOneTicket = Double.parseDouble(scanner.nextLine());
        int percentForCinema = Integer.parseInt(scanner.nextLine());

        double priceTicketForDay = numberTickets * priceForOneTicket;
        double priceForAllPeriod = priceTicketForDay * days;
        double forStudio =  priceForAllPeriod * percentForCinema / 100;
        double sum = priceForAllPeriod - forStudio;

        System.out.printf("The profit from the movie %s is %.2f lv." , movieName , sum);



    }
}
