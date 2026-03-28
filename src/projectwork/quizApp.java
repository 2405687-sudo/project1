package projectwork;


import java.io.*;
import java.util.*;

public class quizApp {

    static List<question> questions = new ArrayList<>();

    public static void loadQuestions() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/questions.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String q = line;
            String a = br.readLine();
            String b = br.readLine();
            String c = br.readLine();
            String d = br.readLine();
            String ans = br.readLine();

            questions.add(new question(q, a, b, c, d, ans));
        }
        br.close();
    }

    public static int evaluate(List<String> userAnswers) {
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            if (userAnswers.get(i).equalsIgnoreCase(questions.get(i).correct)) {
                score++;
            }
        }
        return score;
    }

    public static void saveResult(String id, String name, int score) throws Exception {
        FileWriter fw = new FileWriter("results.txt", true);
        fw.write(id + "," + name + "," + score + "\n");
        fw.close();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        loadQuestions();

        List<String> answers = new ArrayList<>();

        for (question q : questions) {
            System.out.println("\n" + q.question);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);

            System.out.print("Your answer: ");
            answers.add(sc.nextLine());
        }

        int score = evaluate(answers);

        System.out.println("\nScore: " + score + "/" + questions.size());

        if (score >= 5)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");

        saveResult(id, name, score);
    }
}
