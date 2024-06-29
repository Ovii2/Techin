package lt.techin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonDataProcessingTasksTest {

    private PersonDataProcessingTasks tasks;
    private List<String> testData;

    @BeforeEach
    void setUp() {
        tasks = new PersonDataProcessingTasks();
        testData = Arrays.asList("Sebastian,1999", "Alice,1985", "John,1999", "Maria,1992", "Alice,2001");
    }

    @Test
    void testExtractNames() {
        List<String> names = tasks.extractNames(testData);
        assertEquals(Arrays.asList("Sebastian", "Alice", "John", "Maria", "Alice"), names);
    }

    @Test
    void testExtractUniqueYearsOfBirth() {
        List<Integer> years = tasks.extractUniqueYearsOfBirth(testData);
        assertTrue(years.containsAll(Arrays.asList(1999, 1985, 1992, 2001)));
        assertEquals(4, years.size()); // Ensure no duplicates
    }

    @Test
    void testNamesBornInYear() {
        List<String> names1999 = tasks.namesBornInYear(testData, 1999);
        assertEquals(Arrays.asList("Sebastian", "John"), names1999);
    }

    @Test
    void testFindYearOfBirthOfOldestPerson() {
        int oldestYear = tasks.findYearOfBirthOfOldestPerson(testData);
        assertEquals(1985, oldestYear);
    }

    @Test
    void testFindNameOfOldestPerson() {
        String oldestName = tasks.findNameOfOldestPerson(testData);
        assertEquals("Alice", oldestName);
    }

    @Test
    void testConvertToNameAndAge2024() {
        List<String> nameAndAge = tasks.convertToNameAndAge2024(testData);
        assertTrue(nameAndAge.containsAll(Arrays.asList("Sebastian,25", "Alice,39", "John,25", "Maria,32", "Alice,23")));
    }

    @Test
    void testConvertToNameAndAge() {


        List<String> nameAndAge = tasks.convertToNameAndAge(testData);
        int currentYear = Year.now().getValue();

        assertEquals("Sebastian," + (currentYear - 1999), nameAndAge.get(0));
        assertEquals("Alice," + (currentYear - 1985), nameAndAge.get(1));
        assertEquals("John," + (currentYear - 1999), nameAndAge.get(2));
        assertEquals("Maria," + (currentYear - 1992), nameAndAge.get(3));
        assertEquals("Alice," + (currentYear - 2001), nameAndAge.get(4));
    }
}
