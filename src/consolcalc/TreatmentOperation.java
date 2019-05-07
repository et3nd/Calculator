package consolcalc;

public class TreatmentOperation {
    public void charSeparation() throws Exception {
        char[] enter = ReadOperation.readOperation();
        String s1 = "";
        String op1 = "";
        for (Character c : enter) {
            if (c.equals('+') || c.equals('-') || c.equals('*') || c.equals('/')) {
                op1 = op1 + c;
                break;
            }
            s1 = s1 + c;
        }
    }
}
