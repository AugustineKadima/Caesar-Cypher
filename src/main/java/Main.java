import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        CaesarCypher caesarCypher = new CaesarCypher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you Want to do? Encrypt or Decrypt?");
        String choiceCrypt = scanner.nextLine();
        String choiceScriptLowerCase = choiceCrypt.toLowerCase();
        if (choiceScriptLowerCase.equals("encrypt")) {
            System.out.println("Enter the word you wish to encrypt: ");
            String stringToEncrypt = scanner.nextLine();
            System.out.println("Enter shift key: ");
            int shiftKey = scanner.nextInt();
            String encryptedString = caesarCypher.shiftCharOneStepForward(stringToEncrypt, shiftKey);
            System.out.println("*************************************");
            System.out.println("Encrypted word: " + encryptedString);
            System.out.println("*************************************");
        }else if (choiceScriptLowerCase.equals("decrypt")){
            System.out.println("Enter the word you wish to decrypt: ");
            String stringToEncrypt = scanner.nextLine();
            System.out.println("Enter shift key: ");
            int shiftKey = scanner.nextInt();
            String decryptedString = caesarCypher.decipherText(stringToEncrypt, shiftKey);
            System.out.println("*************************************");
            System.out.println("Encrypted word: " + decryptedString);
            System.out.println("*************************************");
        }

    }
}
