public class ASCII_Char {
    public static void main(String args[]) {
        char i;
        int s;
        System.out.println("\tASCII values of characters A-Z :-");
        for (i = 'A'; i <= 'Z'; i++) {
            s = i;
            System.out.println("ASCII value of " + i + " is " + s);
        }
        System.out.println();
        System.out.print("\tASCII values of characters a-z :-");
        System.out.println("");
        for (i = 'a'; i <= 'z'; i++) {
            s = i;
            System.out.println("ASCII value of " + i + " is " + s);
        }
    }
}
