import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        int length = 10; // The length of the password
        boolean includeUppercase = true; // Whether to include uppercase letters
        boolean includeNumbers = true; // Whether to include numbers
        boolean includeSymbols = true; // Whether to include symbols

        String password = generatePassword(length, includeUppercase, includeNumbers, includeSymbols);
        System.out.println("Generated password: " + password);
    }

    public static String generatePassword(int length, boolean includeUppercase, boolean includeNumbers, boolean includeSymbols) {
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numberChars = "0123456789";
        String symbolChars = "!@#$%^&*()_-+=<>?/{}[]|";

        String chars = lowercaseChars;
        if (includeUppercase) {
            chars += uppercaseChars;
        }
        if (includeNumbers) {
            chars += numberChars;
        }
        if (includeSymbols) {
            chars += symbolChars;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        return sb.toString();
    }
}
