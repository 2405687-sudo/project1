package Day9;

import java.io.*;

class CompareBinaryFiles {
    public static void main(String[] args) {

        String file1 = "file1.bin";   // specify file names
        String file2 = "file2.bin";

        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            int b1, b2;
            int position = 0;
            boolean equal = true;

            while (true) {
                b1 = fis1.read();
                b2 = fis2.read();
                position++;

                if (b1 != b2) {
                    equal = false;
                    break;
                }

                if (b1 == -1 && b2 == -1)
                    break;
            }

            fis1.close();
            fis2.close();

            if (equal)
                System.out.println("Two files are equal");
            else
                System.out.println("Two files are not equal: byte position at which two files differ is " + position);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}