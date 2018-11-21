
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        int i = 0;
        letter.toUpperCase();

        if(this.guessedLetters.indexOf(letter) == -1) {
            this.guessedLetters += letter;

            if(this.word.indexOf(letter) == -1)
                this.numberOfFaults++;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hidden = "";

        for (int i = 0; i < this.word.length(); i++) {
            if(this.guessedLetters.indexOf(this.word.charAt(i)) == -1)
                hidden += "_";
            else
                hidden += this.word.charAt(i);
        }


        return hidden;
    }
}
