import java.io.BufferedReader;
import java.io.InputStreamReader;

class Operation {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String enterString() throws Exception {
        return reader.readLine();
    }

    double enterA() throws Exception {
        return Double.parseDouble(reader.readLine());
    }

    double enterB() throws Exception {
        return Double.parseDouble(reader.readLine());
    }

    void go() {}
}
