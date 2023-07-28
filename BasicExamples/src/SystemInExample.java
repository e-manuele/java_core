import java.util.Scanner;

public class SystemInExample {
    public static void main(String[] args) {
        String test = "cioa";
        if (StringEvaluator.isInt(test)) {
            System.out.println(Integer.valueOf(test));
        }

        evaluateInputTillEmpty();
    }

    private static void readInput() {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        System.out.printf("This is user input -> \n %s", in);
        scanner.close();
    }


    public static void readInputTillEmpty() {

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        boolean inputHasNextLine = true;

        while (inputHasNextLine) {

            String in = scanner.nextLine();

            if (in.equals("close")) {
                inputHasNextLine = false;
            } else {
                userInput += "\t" + in + "\n";
            }
        }
        System.out.printf("This is user input -> \n %s", userInput);
        scanner.close();

    }

    public static void evaluateInputTillEmpty() {

        Scanner scanner = new Scanner(System.in);
        StringBuilder userInput = new StringBuilder();
        boolean inputHasNextLine = true;

        while (inputHasNextLine) {

            String in = scanner.nextLine();


            if (in.equals("close")) {
                inputHasNextLine = false;

            } else {
                //StringEvaluator.findAndEvaluateExpression(in);
                StringEvaluator.findAndEvaluateExpressionSlim(in);
                userInput.append(in).append("\n");
            }
        }
        scanner.close();
        System.out.printf("This is user input -> \n %s", userInput.toString());

    }

}
