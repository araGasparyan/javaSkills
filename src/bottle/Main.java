package bottle;
public class Main {
    public static void main(String[] args) {
        int botCount=99;
        for (int i = botCount; i >2; i--) {
            System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer.");
            System.out.println("Take one down and pass it around, "+(i-1)+" bottles of beer on the wall.");
            System.out.println("");
        }
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\n" +
                           "Take one down and pass it around, 1 bottle of beer on the wall.\n");
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                           "Take one down and pass it around, no more bottles of beer on the wall.\n");
        System.out.println("No more bottles of beer on the wall, no more bottles of beer. \n" +
                           "Go to the store and buy some more, "+botCount+" bottles of beer on the wall.");
    }
}
