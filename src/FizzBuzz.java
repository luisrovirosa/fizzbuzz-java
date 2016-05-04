public class FizzBuzz {
    public String[] values() {
        String[] values = new String[100];
        for (int i = 0; i < 100; i++) {
            int number = i + 1;
            if (isFizz(number)) {
                values[i] = "Fizz";
            } else if(isBuzz(number)){
                values[i] = "Buzz";
            } else {
                values[i] = String.valueOf(number);
            }
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
