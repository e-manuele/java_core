import java.util.regex.*;

public class PatternExample {
    public static void main(String[] args) {
        String operation = "1 + 2";
        String patt = "(.*)([+\\-*/])(.*)";
        String patt1 ="^\\s*(\\d+)\\s*([+\\-*/])\\s*(\\d+)\\s*$";

        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(operation);

        if (matcher.matches()) {
            String firstOperand = matcher.group(1);
            String operator = matcher.group(2);
            String secondOperand = matcher.group(3);
            System.out.printf("First operand is: %s\n", firstOperand);
            System.out.printf("Operator is: %s\n", operator);
            System.out.printf("Second operand is: %s\n", secondOperand);
        }
    }


}
