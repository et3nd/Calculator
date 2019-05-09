package consolcalc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReadOperation {

    static String readOperation() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine().replaceAll(" ", "");
        } catch (Exception e) {
            return null;
        }
    }
}
