package Day9;

import java.io.*;
import java.util.Scanner;

class FileStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter file name:");
            String fileName = sc.nextLine();

            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            int characters = 0;
            int words = 0;
            int lines = 0;

            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] wordArray = line.split("\\s+");
                if (line.trim().length() > 0)
                    words += wordArray.length;
            }

            br.close();

            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
