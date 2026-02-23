package Day9;

import java.io.*;
import java.util.Scanner;

class CopyCharStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter source file name:");
            String source = sc.nextLine();

            System.out.println("Enter destination file name:");
            String dest = sc.nextLine();

            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(dest);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File Copied Successfully (Character Stream)");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
