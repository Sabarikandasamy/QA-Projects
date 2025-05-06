package Other_Projects.DemoProjects;

import java.util.Scanner;

public class Three_line_string_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 lines (e.g., java 100):");
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter String and Integer: ");
        String s1 = sc.next();
        int x = sc.nextInt();
        System.out.printf("%-15s%03d\n", s1, x);
    }
        System.out.println("================================");
}}
