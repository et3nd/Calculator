import consolcalc.ReadOperation;
import consolcalc.TreatmentOperation;

public class Test {

    public static void main(String[] args) {
        TreatmentOperation tr = new TreatmentOperation();
        try {
            tr.charSeparation();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
