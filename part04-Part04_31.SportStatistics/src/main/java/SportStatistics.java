
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        String[] splitString;

        int gameCounter = 0;
        int winCounter = 0;
        int loseCounter = 0;

        Scanner scan = new Scanner(System.in);

        // Prompt user for file name.
        System.out.println("File: ");
        String file = scan.nextLine();

        // Prompt user for team name.
        System.out.println("Team: ");
        String team = scan.nextLine().toLowerCase();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            // we read the file until all lines have been read.
            while (scanner.hasNextLine()) {

                // we read one line.
                String row = scanner.nextLine();
                splitString = row.split(",");
                String homeTeam = splitString[0].trim();
                String awayTeam = splitString[1].trim();

                int homePoints = Integer.valueOf(splitString[2].trim());
                int awayPoints = Integer.valueOf(splitString[3].trim());

                if (homeTeam.toLowerCase().equals(team)) {
                    gameCounter++;
                    if (homePoints > awayPoints) {
                        winCounter++;
                    } else {
                        loseCounter++;
                    }
                }

                if (awayTeam.toLowerCase().equals(team)) {
                    gameCounter++;
                    if (awayPoints > homePoints) {
                        winCounter++;
                    } else {
                        loseCounter++;
                    }
                }

            }
            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + winCounter);
            System.out.println("Losses: " + loseCounter);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

    }

}
