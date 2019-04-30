class OperationSelect {
    private void select() {
        Operation operation = new Operation();
        try {
            System.out.println("Предоставлено 4 варианта работы калькулятора: Сложение, Деление, Вычитание, Умножение. Выберите нужный вариант");
            switch (operation.enterString()) {
                case ("Сложение"):
                    Summ summ = new Summ();
                    summ.go();
                    break;
                case ("Вычитание"):
                    Diff diff = new Diff();
                    diff.go();
                    break;
                case ("Умножение"):
                    Mult mult = new Mult();
                    mult.go();
                    break;
                case ("Деление"):
                    Div div = new Div();
                    div.go();
                    break;
                default:
                    System.out.println("Илья крутой но мяу");
                    break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    void run() {
        select();
    }
}
