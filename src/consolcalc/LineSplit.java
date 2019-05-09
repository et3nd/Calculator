package consolcalc;

class LineSplit {

    private String acceptString = ReadOperation.readOperation();

    private double[] splitNumbers() throws NumberFormatException {
        String lineOfNumbers = acceptString.replaceAll("\\+", " ")
                .replaceAll("-", " ")
                .replaceAll("\\*", " ")
                .replaceAll("/", " ");
        String[] splitLineOfNumbers = lineOfNumbers.split(" ");
        double[] numbers = new double[splitLineOfNumbers.length];
        for (int i = 0; i < splitLineOfNumbers.length; i++) {
            numbers[i] = Double.parseDouble(splitLineOfNumbers[i]);
        }
        return numbers;
    }

    double[] getSplitNumbers() {
        try {
            return splitNumbers();
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private String[] splitOperations() {
        String lineOfOperations = acceptString.replaceAll("\\d", "");
        return lineOfOperations.split("");
    }

    String[] getSplitOperatios() {
        return splitOperations();
    }

}
