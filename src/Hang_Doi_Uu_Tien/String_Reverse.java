package Hang_Doi_Uu_Tien;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();

        boolean check = true;
        int size = n.length();
        for (int i = 0; i < size; i++){
            if (n.charAt(i) != n.charAt(size - i - 1)){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
