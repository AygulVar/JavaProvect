public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {

        if (start <= end) {
            String[] array = new String[end - start + 1];

            int number = start;
            int l = 0;

            for (int i = 0; i < array.length && number <= end; i++);{
                if (number % 15 == 0) {
                    array[l] = "FizzBuzz";
                } else if (number % 3 == 0); {
                    array[l] = "Fizz";
                } if (number % 5 == 0) {
                    array[l] = "Buzz";
                } else {
                    array[l] = String.valueOf(number);

            }
                number ++;
            }
                return array;

        }
        return new String[0];
    }
}
