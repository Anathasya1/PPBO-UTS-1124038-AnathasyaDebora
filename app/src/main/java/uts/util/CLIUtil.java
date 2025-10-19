package uts.util;

import java.util.Scanner;

public class CLIUtil {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static int getInt() {
        return sc.nextInt();
    }

    public static double getDouble() {
        return sc.nextDouble();
    }

    public static String getString(){
        return sc.nextLine();
    }
}
