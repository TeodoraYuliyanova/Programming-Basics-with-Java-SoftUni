import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberMovies = Integer.parseInt(scanner.nextLine());

        String movieNameMAxRating = "";
        double maxRating = Integer.MIN_VALUE;
        String movieNameMinRating = "";
        double minRating = Integer.MAX_VALUE;
        double sumRating = 0;

        for (int movie = 1; movie <= numberMovies; movie++) {
            String movieName = scanner.nextLine();
            double ratingMovie = Double.parseDouble(scanner.nextLine());
            sumRating += ratingMovie;

            if (ratingMovie > maxRating) {
                maxRating = ratingMovie;
                movieNameMAxRating = movieName;
            }

            if (ratingMovie < minRating) {
                minRating = ratingMovie;
                movieNameMinRating = movieName;
            }
        }


            System.out.printf("%s is with highest rating: %.1f%n", movieNameMAxRating, maxRating);
            System.out.printf("%s is with lowest rating: %.1f%n", movieNameMinRating, minRating);

            double averageRating = sumRating / numberMovies;
            System.out.printf("Average rating: %.1f", averageRating);



    }
}
