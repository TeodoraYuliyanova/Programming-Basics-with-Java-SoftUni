import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();

        int countBooks = 0;
        boolean isFound = false;

        String inputBook = scanner.nextLine();

        while (!inputBook.equals("No More Books")) {

            if (searchedBook.equals(inputBook)) {
                isFound = true;
                break;
            }
            countBooks++;
            inputBook = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.", countBooks);
        }
    }
}
