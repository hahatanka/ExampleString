import java.util.Scanner;

public class ExampleString {
    public static void main(String[] args) {
        String text = "this is a text";
        String newText = new String("this is a text");

        System.out.println(text.length());

//        if (text.equals(newText)) {
//            System.out.println("text is equal to the next text");
//            return;
//        }

        String password;
        int passwordMinLength = 8;

        do {
            //ask for the password as long as the user doesn't put the right length
            System.out.println("enter password");
            Scanner scanner = new Scanner(System.in);
            password = scanner.nextLine();

            if (password.length() < passwordMinLength) {
                System.out.println("password must be greater than " + passwordMinLength);
            } else {
                System.out.println("password is accepted");
            }
        } while ((password.length() < passwordMinLength));
    }
    }




//if (password.length() < passwordMinLength) {
//            System.out.println("password must be greater than " + passwordMinLength);
//        return;
//        }
//        System.out.println("password is accepted");
//        return;
//
//    }