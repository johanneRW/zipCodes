package company;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ZipCodeList zipCodeList = new ZipCodeList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvad er postnummeret på den by/bydel du søger?");
        String input = scanner.nextLine();
        String result = zipCodeList.findCity(input);
        System.out.println(input + " svarer til " + result);
    }
}