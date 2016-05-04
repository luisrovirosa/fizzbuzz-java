public class FizzBuzz {

    public String[] values() {
        String[] values = new String[100];
        for (int i = 0; i < 100; i++) {
            values[i] = value(i + 1);
        }
        return values;
    }

    private String value(int number) {
        String value;
        if (isFizzBuzz(number)) {
            value = "FizzBuzz";
        } else if (isFizz(number)) {
            value = "Fizz";
        } else if (isBuzz(number)) {
            value = "Buzz";
        } else {
            value = String.valueOf(number);
        }
        return value;
    }

    private boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    private boolean isBuzz(int number) {
        return isMultiple(number, 5);
    }

    private boolean isFizz(int number) {
        return isMultiple(number, 3);
    }

    private boolean isMultiple(int number, int multipleOf) {
        return number % multipleOf == 0;
    }
}
