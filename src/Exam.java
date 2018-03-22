import java.util.Random;
import java.util.Scanner;

public class Exam {

    int[] firstTerms;
    int[] secondTerms;
    int[] answers;

    public Exam() {

        firstTerms = genNumbers(99);
        secondTerms = genNumbers(99);
        answers = administerTest();
        correctTest();
    }

    public int[] genNumbers(int limit) {

        Random random = new Random();

        int[] terms = new int[10];

        for (int i = 0; i < 10; i++) {

            terms[i] = random.nextInt(limit);

        }

        return terms;

    }

    public int[] administerTest() {

        Scanner scanner = new Scanner(System.in);
        int[] userResponse = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("\n " + firstTerms[i] + " + " + secondTerms[i] + " = ");
            userResponse[i] = scanner.nextInt();

        }

        return userResponse;
    }

    public void correctTest() {

        int correct = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("\n" + firstTerms[i] + " + " + secondTerms[i] + " = " + answers[i]);

            if (firstTerms[i] + secondTerms[i] == answers[i]) {

                System.out.print(" CORRECT\n");
                correct+=10;

            } else {
                System.out.print(" INCORRECT\n");
            }
        }

        System.out.print("\nScore: " + String.valueOf(correct) + "/100");
    }

    public static void main(String[] args){

        Exam exam = new Exam();
    }

}
