public class ExampleWithTrim {
    public static void main(String[] args) {
        String savedUsername = "David";
        String testUsername = "David ";
        if (savedUsername.equals(testUsername.trim())) {// "trim" method trims out the first and last space
            System.out.println("they are equal");
        }else {
            System.out.println(testUsername + "is not correct");
        }
    }
}
