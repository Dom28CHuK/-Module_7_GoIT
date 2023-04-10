import classes.Examples;

public class Main {
    public static void main(String[] args) {
        Examples examples = new Examples();

        String reversed = Examples.reverseStringWithNewObject("Hello World");
        System.out.println(reversed);

        String reversed1 = Examples.reverseStringWithoutAdditionalMemoryUsage("Hello World!");
        System.out.println(reversed1);

        String reversed2 = Examples.stringBuilderReverseExample("Hello, World!");
        System.out.println(reversed2);
    }
}
