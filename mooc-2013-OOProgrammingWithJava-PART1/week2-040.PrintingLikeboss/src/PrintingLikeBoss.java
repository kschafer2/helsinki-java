public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for(int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for(int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle(int size) {
        // 40.2
        for(int i = 1; i <= size; i++) {
            printWhitespaces(size-i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        for(int i = height-1; i >= 0; i--) {
            printWhitespaces(i);
            printStars(2*(height-i)-1);
        }
        int i = height-2;
        for(int stand = 0; stand < 2; stand++) {
            printWhitespaces(i);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(10);
        System.out.println("---");
        //xmasTree(10);
    }
}
