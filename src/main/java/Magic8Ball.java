import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 * To get a response from the user, use the getUserQuestion() method at the bottom of this file
 */
public class Magic8Ball {
    public static String getUserQuestion(){

        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        return question;
    }


    public static void main(String[] args){

        Scanner keyboardInput = new Scanner(System.in);
        // Get random a number from: [0, 1, 2, 3]
        Random randomInt = new Random();


        String question;
        int randNumber = new Random().nextInt(4);
        String answer;


        System.out.print("Ask a yes or no question: ");
        //  Ask the user to enter a question for the magic 8-ball

        question = keyboardInput.nextLine();

        if(randNumber == 0){
            // Tell the user "Yes"
            answer = "Yes";
        } else if (randNumber == 1) {
            // Tell the user "No"
            answer = "No";
        }else if (randNumber == 2) {
            // Tell the user a custom response
            answer = "Ask the question again";
        } else if (randNumber == 3) {
            // Tell the user a custom response
            answer = "Maybe in the near future";
        } else {
            answer = "Ask again later";
        }
        System.out.println(answer);
    }


}




