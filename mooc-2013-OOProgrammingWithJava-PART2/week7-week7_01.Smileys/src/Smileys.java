
public class Smileys {

    public static void main(String[] args) {
        int length = 6;
        //printSmileyRow(length);
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    public static boolean isOdd(int length) {
        if (length % 2 != 0)
            return true;
        return false;
    }

    public static int findRowLength(int length) {
        if (isOdd(length))
            length++;

        length += 6;
        length /= 2;

        return length;
    }

    public static void printSmileyRow(int length) {

        length = findRowLength(length);

        for(int i = 0; i < length; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

    private static void printWithSmileys(String characterString) {
        printSmileyRow(characterString.length());
        System.out.print(":) " + characterString);

        if(isOdd(characterString.length()))
            System.out.print(" ");

        System.out.println(" :)");
        printSmileyRow(characterString.length());

    }
}
