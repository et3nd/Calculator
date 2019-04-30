class Div extends Operation {

    @Override
    void go() {
        try {
            double n = enterA() / enterB();
            System.out.println(n);
        }
        catch (NumberFormatException e) {
            System.out.println("Надо 2 числа ввести ало");
        }
        catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя и вся хуйня");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
