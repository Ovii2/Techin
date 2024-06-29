package lt.techin;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDataProcessingTasks {

    /**
     * Task: Given a list of strings in the format "name,yearOfBirth", such as "Sebastian,1999",
     * return a list of names.
     */
    public List<String> extractNames(List<String> data) {
        ArrayList<String> namesArr = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String name = data.get(i).split(",")[0];
            namesArr.add(name);
        }
        return namesArr;
    }

    /**
     * Task: From a list of strings in the format "name,yearOfBirth", return a list of years of birth,
     * ensuring there are no duplicates in the list.
     */
    public List<Integer> extractUniqueYearsOfBirth(List<String> data) {
        ArrayList<Integer> yearsArr = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String s = data.get(i).split(",")[1];
            int a = (Integer.parseInt(s));
            if (!yearsArr.contains(a)) {
                yearsArr.add(a);
            }

        }
        return yearsArr;
    }

    /**
     * Task: Given a list of strings in the format "name,yearOfBirth" and a specific year,
     * return a list of names of people born in that year.
     */
    public List<String> namesBornInYear(List<String> data, int year) {
        ArrayList<String> namesArr = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String name = data.get(i).split(",")[0];
            int yearBorn = Integer.parseInt(data.get(i).split(",")[1]);
            if (yearBorn == year) {
                namesArr.add(name);
            }
        }
        return namesArr;
    }

    /**
     * Task: From a list of strings in the format "name,yearOfBirth", find and return the year of birth
     * of the oldest person.
     */
    public int findYearOfBirthOfOldestPerson(List<String> data) {
        int oldest = Integer.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            int yearBorn = Integer.parseInt(data.get(i).split(",")[1]);
            if (yearBorn < oldest) {
                oldest = yearBorn;
            }
        }
        return oldest;
    }

    /**
     * Task: Given a list of strings in the format "name,yearOfBirth", return the name of the oldest person.
     */
    public String findNameOfOldestPerson(List<String> data) {
        String oldestName = "";
        int oldest = Integer.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            String name = data.get(i).split(",")[0];
            int yearBorn = Integer.parseInt(data.get(i).split(",")[1]);
            if (oldest > yearBorn) {
                oldestName = name;
            }
        }
        return oldestName;
    }

    /**
     * Task: Convert a list of strings in the format "name,yearOfBirth" to a list of strings in the format
     * "name,age", assuming the current year is 2024.
     */
    public List<String> convertToNameAndAge2024(List<String> data) {
        ArrayList<String> arr = new ArrayList<>();
        int currentYear = 2024;
        for (int i = 0; i < data.size(); i++) {
            String name = data.get(i).split(",")[0];
            int yearBorn = Integer.parseInt(data.get(i).split(",")[1]);
            int currentAge = currentYear - yearBorn;
            arr.add(name + "," + currentAge);

        }
        return arr;
    }

    public List<String> convertToNameAndAge(List<String> data) {
        ArrayList<String> arr = new ArrayList<>();
        int currentYear = Year.now().getValue();
        for (int i = 0; i < data.size(); i++) {
            String name = data.get(i).split(",")[0];
            int yearBorn = Integer.parseInt(data.get(i).split(",")[1]);
            int currentAge = currentYear - yearBorn;
            arr.add(name + "," + currentAge);

        }
        return arr;
    }
}
