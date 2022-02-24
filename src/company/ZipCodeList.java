package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ZipCodeList {
    private ArrayList<PostInfo> postInfoList = new ArrayList<>();
    File file = new File("data/danske-postnumre-byer-ny.csv");


    public ZipCodeList() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(file);
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] lineAsArray = line.split(";");
            int zipCode = Integer.parseInt(lineAsArray[0]);
            String cityName = lineAsArray[1];
            PostInfo postInfo = new PostInfo(zipCode, cityName);
            postInfoList.add(postInfo);
        }
    }

    public String findCity(String zipCodeAsString) {
        int zipCode = stringToInt(zipCodeAsString);

        for (PostInfo currentPostInfo : postInfoList) {
            int currentZipCode = currentPostInfo.getZipCode();

            if (currentZipCode == zipCode) {
                return currentPostInfo.getCity();
            }
        }
        return "kunne ikke finde en by";
    }

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }

}
