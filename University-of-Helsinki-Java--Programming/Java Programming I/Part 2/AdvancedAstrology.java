
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; ++i){
            System.out.print('*');
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; ++i){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = size-1; i >= 0; --i){
            printSpaces(i);
            printStars(size - i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for(int i = height-1; i >= 0; --i){
            printSpaces(i);
            printStars(2*height - 2*i - 1);
        }
        for(int i = 0; i < 2; ++i){
            printSpaces(height -2 );
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(1);
        System.out.println("---");
        christmasTree(7);
        System.out.println("---");
        christmasTree(10);
    }
}
