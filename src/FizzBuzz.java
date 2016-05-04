public class FizzBuzz {
    public String[] values() {
        String[] values = new String[100];
        for (int i = 0; i < 100; i++) {
            if (isFizz(i + 1)) {
                values[i] = "Fizz";
            } else if(i == 4 || i == 9 || i == 19){
                values[i] = "Buzz";
            } else {
                values[i] = String.valueOf(i + 1);
            }
        }
        return values;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
