public class Change {
    private char fromCharacter;
    private char toCharacter;
    private int numberOfChanges;

    public Change(char fromCharacter, char toCharacter)
    {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {

                String newCharacterString = characterString.replace(fromCharacter, toCharacter);

                if(!(newCharacterString.equals(characterString)))
                    numberOfChanges++;

        return newCharacterString;
    }


}
