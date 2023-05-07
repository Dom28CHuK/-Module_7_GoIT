import classes.EmailDetector;

public class Main {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));

        //false
        System.out.println(new EmailDetector().isPresent("ydm j fu@o c"));

        //false
        System.out.println(new EmailDetector().isPresent("zepel g la eju g@pa r gyxir xi"));

        //true
        System.out.println(new EmailDetector().isPresent("This email is andriydomchuk@gmail.com"));
    }
}
