package CWH.exerciseQues;

import java.util.*;

/*
You have to create a custom calculator with following operations :
1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
 */

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Input is Invalid";
    }

    @Override
    public String getMessage() {
        return "Please Enter correct input";
    }
}

class CannotDivideBy0Exception extends Exception {
    @Override
    public String toString() {
        return "cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "Please Enter correct input";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input is greater than 100000";
    }

    @Override
    public String getMessage() {
        return "Please Enter lesser values";
    }
}

class MaxMultiplierInputException extends Exception {
    @Override
    public String toString() {
        return "Multiplication input is greater than 7000";
    }

    @Override
    public String getMessage() {
        return "Please Enter lesser values";
    }
}

class CC {
    double operand1;
    double operand2;
    String operator;

    CC(String operator, double operand1, double operand2) throws InvalidInputException, MaxInputException, MaxMultiplierInputException {
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            throw new InvalidInputException();
        }

        if (operand1 > 100000 || operand2 > 100000) {
            throw new MaxInputException();
        }

        if (operator.equals("*") && (operand1 > 7000 || operand2 > 7000)) {
            throw new MaxMultiplierInputException();
        }

        if ((operand1 == 8 && operand2 == 9) ||
                (operand1 == 9 && operand2 == 8)) {
            throw new InvalidInputException();
        }
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public void calculate() throws CannotDivideBy0Exception {
        switch (operator) {
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.println(operand1*operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    throw new CannotDivideBy0Exception();
                }
                System.out.println(operand1/operand2);
                break;
            default:
                System.out.println("Operation is not available");
        }
    }
}

public class customCalculator {
    public static void main(String[] args) throws  InvalidInputException, MaxInputException, MaxMultiplierInputException, CannotDivideBy0Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator and operands");
        try {
            CC c1 = new CC(sc.next(), sc.nextDouble(), sc.nextDouble());
            c1.calculate();
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (MaxInputException e) {
            System.out.println(e.getMessage());
        } catch (MaxMultiplierInputException e) {
            System.out.println(e.getMessage());
        } catch (CannotDivideBy0Exception e) {
            System.out.println(e.getMessage());
        }

        CC c2 = new CC(sc.next(), sc.nextDouble(), sc.nextDouble());
        c2.calculate();
    }
}
