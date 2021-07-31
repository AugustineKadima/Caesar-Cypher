import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        CaesarCypher caesarCypher = new CaesarCypher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you wish to encrypt...");
        String stringToEncrypt = scanner.nextLine();
        System.out.println("Enter shift key...");
        int shiftKey = scanner.nextInt();
        String encryptedString = caesarCypher.shiftCharOneStepForward(stringToEncrypt, shiftKey);
        System.out.println("Encrypted word: " + encryptedString);


    }
}
