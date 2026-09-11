public class CalculatorNoException {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        // The result of the operation
        int result = 0;

        // Check if integer
        for (int i = 0; i < args[0].length(); i++) {
            if (!Character.isDigit(args[0].charAt(i))) {
                System.out.println("Operand must be a number.");
                System.exit(1);
            }
        }

        for (int i = 0; i < args[2].length(); i++) {
            if (!Character.isDigit(args[2].charAt(i))) {
                System.out.println("Operand must be a number.");
                System.exit(2);
            }
        }

        // Determine the operator
        
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '*':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}




