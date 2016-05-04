public class FizzBuzz {
    public String[] values() {
        String[] values = new String[100];
        for (int i = 0; i < 100; i++) {
            int number = i + 1;
            String value;
            if (isFizz(number) && isBuzz(number)) {
                value = "FizzBuzz";
            } else if (isFizz(number)) {
                value = "Fizz";
            } else if (isBuzz(number)) {
                value = "Buzz";
            } else {
                value = String.valueOf(number);
            }
            values[i] = value;
        }
        return values;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
