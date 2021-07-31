/*
CAESAR CYPHER
char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
'l', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',  'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
There is a shift of 1 pushing letters forward
EXPECTED
Char[] shiftedAlphabet = {'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
'l', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',  'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a'}

METHOD
Break a string to characters
Create a characters array
Use character++ method
Loop through an array for character array
Input string
output character
Convert output to string
Join string characters to form words
If character does not exist, character is empty or character is a punctuation mark do not shift.
*/

public class CaesarCypher {
    int shiftValue;
    String alphabetWord;

    public String getAlphabetWord() {
        return alphabetWord;
    }

    public void setAlphabetWord(String alphabetWord) {
        this.alphabetWord = alphabetWord;
    }

    public int getShiftValue() {
        return shiftValue;
    }

    public void setShiftValue(int shiftValue) {
        this.shiftValue = shiftValue;
    }

    public String shiftCharOneStepForward(String randomWord, int shiftValue){
        this.alphabetWord = randomWord;
        this.shiftValue = shiftValue;

        String newShiftedString = "";

        char[] alphabetCharacters = this.alphabetWord.toCharArray();

            if(shiftValue == 0 && !randomWord.equals("")) newShiftedString = this.alphabetWord;
            else if (randomWord.equals("") && shiftValue >= 0 && shiftValue < 26) newShiftedString = "Please type your word";
            else if ((randomWord.equals("")|| !randomWord.equals("")) && (shiftValue < 1 || shiftValue > 25)){
                newShiftedString = "Shift value should be a number greater or equal to 1 and less or equal to 25";
            }

            for(char character: alphabetCharacters){
                if (!randomWord.equals("") && shiftValue >= 1 && shiftValue < 26){
                  int charVal =  Character.valueOf(character) + shiftValue;
                  char shifted = (char) charVal;

                  newShiftedString += Character.toString(shifted);
                }
            }
        return newShiftedString;
    }
    public String decipherText(String randomWord, int shiftValue){

        this.alphabetWord = randomWord;
        this.shiftValue = shiftValue;

        String newShiftedString = "";

        char[] alphabetCharacters = this.alphabetWord.toCharArray();

        if(shiftValue == 0 && !randomWord.equals("")) newShiftedString = this.alphabetWord;
        else if (randomWord.equals("") && shiftValue >= 0 && shiftValue < 26) newShiftedString = "Please type your word";
        else if ((randomWord.equals("")|| !randomWord.equals("")) && (shiftValue < 1 || shiftValue > 25)){
            newShiftedString = "Shift value should be a number greater or equal to 1 and less or equal to 25";
        }

        for(char character: alphabetCharacters){
            if (!randomWord.equals("") && shiftValue >= 1 && shiftValue < 26){
                int charVal =  Character.valueOf(character) - shiftValue;
                char shifted = (char) charVal;

                newShiftedString += Character.toString(shifted);
            }
        }
        return newShiftedString;
    }

}
