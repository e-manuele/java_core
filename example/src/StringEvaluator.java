

public class StringEvaluator {

    public static void findAndEvaluateExpression(String expr) {
        if (expr.contains("+")) {
            int a = Integer.parseInt(expr.substring(0, expr.indexOf("+")).trim());
            int b = Integer.parseInt(expr.substring(expr.indexOf("+") + 1).trim());
            System.out.println(a + b);
        } else if (expr.contains("-")) {
            int a = Integer.parseInt(expr.substring(0, expr.indexOf("-")).trim());
            int b = Integer.parseInt(expr.substring(expr.indexOf("-") + 1).trim());
            System.out.println(a - b);
        } else if (expr.contains("*")) {
            int a = Integer.parseInt(expr.substring(0, expr.indexOf("*")).trim());
            int b = Integer.parseInt(expr.substring(expr.indexOf("*") + 1).trim());
            System.out.println(a * b);
        } else if (expr.contains("/")) {
            int a = Integer.parseInt(expr.substring(0, expr.indexOf("/")).trim());
            int b = Integer.parseInt(expr.substring(expr.indexOf("/") + 1).trim());
            System.out.println(a / b);
        }
    }

    public static void findAndEvaluateExpressionSlim(String expr) {
        String[] operation = {"+", "-", "*", "/"};
        for (String op : operation) {
            if (expr.contains(op)) {
                String as = expr.substring(0, expr.indexOf(op)).trim();
                String bs = expr.substring(expr.indexOf(op) + 1).trim();
                if (isInt(as) && isInt(bs)) {
                    int a = Integer.parseInt(as);
                    int b = Integer.parseInt(bs);
                    doOperation(a, b, op);
                } else {
                    System.out.println("Operation on String is not possible");
                }
            }
        }
    }

    private static void doOperation(int a, int b, String c) {
        if (c.contains("+")) {
            System.out.println(a + b);
        } else if (c.equals("-")) {
            System.out.println(a - b);
        } else if (c.equals("*")) {
            System.out.println(a * b);
        } else if (c.equals("/")) {
            System.out.println(a / b);
        }
    }

    static boolean isInt(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }


}
