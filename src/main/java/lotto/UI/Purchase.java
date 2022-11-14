package lotto.UI;

public class Purchase {
    private final Integer count;
    public Purchase(String input) {
        int money = convertInputToNumber(input);
        validate(money);
        this.count = money / 1000;
    }
    public static int convertInputToNumber(String input) {
        int number = 0;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }
        return number;
    }
    public static void validate(int money) {
        Error error = new Error();

        if (money == 0) {
            error.amountInput();
        }
        else if (money % 1000 != 0) {
            error.amountInput();
        }
        else if (money / 1000 < 1) {
            error.amountInput();
        }
    }
    public int getCount() {
        return this.count;
    }
}