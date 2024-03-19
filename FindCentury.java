import java.util.Scanner;

public class FindCentury {
    static void find_century(int year) {
        if (year <= 0)
            System.out.println("0 and negative is not allow for a year");

        else if (year <= 100)
            System.out.println("1st century\n");

        else if (year % 100 == 0)
            System.out.println(year / 100 + "century");

        else
            System.out.println(year / 100 + 1 + "century");

    }

    public static void main(String[] args) {
        int year = 2024;
        find_century(year);
    }
}