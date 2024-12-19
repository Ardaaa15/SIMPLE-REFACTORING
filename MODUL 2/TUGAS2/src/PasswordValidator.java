import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password valid!");
        } catch (InvalidPasswordException e) {
            System.out.println("Password tidak valid: " + e.getMessage());
        }
    }

    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password harus minimal 8 karakter");
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("!@#$%^&*".indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }

        if (!hasUppercase) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu huruf besar");
        }
        if (!hasLowercase) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu huruf kecil");
        }
        if (!hasDigit) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu angka");
        }
        if (!hasSpecialChar) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu karakter khusus (!@#$%^&*)");
        }
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}