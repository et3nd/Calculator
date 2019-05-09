package consolcalc;

import consolcalc.myexceptions.NoPriorityException;

public class ImplementOperation {
    private LineSplit lineSplit = new LineSplit();
    private double result = 0;
    private String[] operations = lineSplit.getSplitOperatios();
    private double[] nums =  lineSplit.getSplitNumbers();

    private void operationType(double numberOne, double numberTwo, String operation) {
        switch (operation) {
            case ("+"):
                result = numberOne + numberTwo;
                break;
            case ("-"):
                result = numberOne - numberTwo;
                break;
            case ("*"):
                result = numberOne * numberTwo;
                break;
            case ("/"):
                result = numberOne / numberTwo;
                break;
        }
    }

    private void checkOperations() throws NoPriorityException {
        for (int i = 1; i < operations.length; i++) {
            if ((operations[i - 1].equals("+") || operations[i - 1].equals("-")) && (operations[i].equals("*") || operations[i - 1].equals("/"))) {
                throw new NoPriorityException("Допустимо выражение только с операциями \"+\" и \"-\", либо \"*\" и \"/\".");
            }
        }
    }

    private void realizeOperation() {
        try {
            checkOperations();
            operationType(nums[0], nums[1], operations[0]);
            for (int i = 2; i < nums.length; i++) {
                operationType(result, nums[i], operations[i - 1]);
            }
            System.out.println(result);
        } catch (NoPriorityException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ошибка ввода. Недопустим ввод букв, нескольких подряд операторов и отрицательных чисел (Соре).");
        }
    }

    public void startConsolCalc() {
        realizeOperation();
    }
}
