public class FizzBuzz {
    public String[] values() {
        String[] values = new String[100];
        for (int i = 0; i < 100; i++) {
            if ((i +1) % 3 == 0) {
                values[i] = "Fizz";
            } else {
                values[i] = String.valueOf(i + 1);
            }
        }
        return values;
    }
}
