package classes;

public class Examples {
    public static String reverseStringWithNewObject(String input) {
        char[] inputChars = input.toCharArray();
        char[] result = new char[inputChars.length];

        for (int i = 0; i < inputChars.length; i++) {
            result[i] = inputChars[inputChars.length - 1 - i];
        }
        return new String(result);
    }

    public static String reverseStringWithoutAdditionalMemoryUsage(String input) {
        char[] inputArray = input.toCharArray();
        int begin = 0;
        int end = inputArray.length - 1;

        char temp;

        while (begin < end) {
            temp = inputArray[begin];
            inputArray[begin] = inputArray[end];
            inputArray[end] = temp;
            begin++;
            end--;
        }
        return new String(inputArray);
    }

    public static String stringBuilderReverseExample(String input) {
        StringBuilder builder = new StringBuilder();
        String result = builder.append(input).reverse().toString();
        return result;
    }
}
