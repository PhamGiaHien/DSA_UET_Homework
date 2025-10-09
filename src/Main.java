import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        char[] c = n.toCharArray();
        int size = c.length;

        boolean check = true;
        for (int i = 0; i < size; i++){
            if (c[i] != c[size - i - 1]){
                check = false;
                break;
            }
        }

        if (check){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}