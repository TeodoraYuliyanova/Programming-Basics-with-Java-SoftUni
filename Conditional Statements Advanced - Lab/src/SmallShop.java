import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sum = 0.0;


        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                sum = quantity * 0.50;
                System.out.println(sum);
            } else if (product.equals("water")) {
                sum = quantity * 0.80;
                System.out.println(sum);
            } else if (product.equals("beer")) {
                sum = quantity * 1.20;
                System.out.println(sum);
            } else if (product.equals("sweets")) {
                sum = quantity * 1.45;
                System.out.println(sum);
            } else if (product.equals("peanuts")) {
                sum = quantity * 1.60;
                System.out.println(sum);
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                sum = quantity * 0.40;
                System.out.println(sum);
            } else if (product.equals("water")) {
                sum = quantity * 0.70;
                System.out.println(sum);
            } else if (product.equals("beer")) {
                sum = quantity * 1.15;
                System.out.println(sum);
            } else if (product.equals("sweets")) {
                sum = quantity * 1.30;
                System.out.println(sum);
            } else if (product.equals("peanuts")) {
                sum = quantity * 1.50;
                System.out.println(sum);
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                sum = quantity * 0.45;
                System.out.println(sum);
            } else if (product.equals("water")) {
                sum = quantity * 0.70;
                System.out.println(sum);
            } else if (product.equals("beer")) {
                sum = quantity * 1.10;
                System.out.println(sum);
            } else if (product.equals("sweets")) {
                sum = quantity * 1.35;
                System.out.println(sum);
            } else if (product.equals("peanuts")) {
                sum = quantity * 1.55;
                System.out.println(sum);
            }


        }


    }


}
