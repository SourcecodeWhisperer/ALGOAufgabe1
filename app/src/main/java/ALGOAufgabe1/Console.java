package ALGOAufgabe1;

import java.util.Scanner;

public class Console {
    static public int readIntegerFromStdIn(String text,int x) {
        Scanner in = new Scanner(System.in);
        System.out.print(text + " ");
        int num = 0;

        try {
            num = in.nextInt();
        } catch (Exception e) {
            if(x == 1) {
                System.err.println("Error is not an Number! please Choose an Number");
                return Console.readIntegerFromStdIn("\n\tPlease insert a number:", 1);
            }else {
                System.err.println("Error is not an Number! please Choose an Number");
                num = in.nextInt();
            }
        }

        return num;
    }

    static public String readStringFromStdIn(String text) {
        String name = "";
        System.out.print(text + " ");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        return name;
    }
}
