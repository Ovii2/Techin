package lt.techin.ovidijus;

import lt.techin.municipality.IllegalCitizenException;
import lt.techin.municipality.Municipality;
import lt.techin.municipality.Person;
import lt.techin.municipality.PersonPredicate;

import java.time.LocalDate;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class MunicipalityImpl implements Municipality {

    private ArrayList<Person> population = new ArrayList<>();
    TaxCalculatorImpl taxes = new TaxCalculatorImpl();

    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {
        LocalDate currentDate = LocalDate.now();
        if (person.getFirstName() == null || person.getLastName() == null || person.getDateOfBirth() == null
                || person.getYearlyIncome() < 0 || person.getDateOfBirth().isAfter(currentDate)
        ) {
            throw new IllegalCitizenException(person);
        }
        if (!population.contains(person)) {
            population.add(person);
        }
    }


    @Override
    public int getCitizenCount() {
        return population.size();
    }

    @Override
    public double getAverageCitizenIncome() {
        return population.stream()
                .mapToDouble(Person::getYearlyIncome)
                .average().
                orElse(0.0);
    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        return population.contains(person);
    }

    @Override
    public Person findOldestPerson() {
        return population.stream()
                .min(Comparator.comparing(Person::getDateOfBirth))
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public int countAdultCitizens() {
        int currentYear = Year.now().getValue();
        return (int) population.stream()
                .filter(c -> (currentYear - c.getDateOfBirth().getYear() >= 18))
                .count();
    }


    @Override
    public double totalIncomeInTaxes() {
        return population.stream()
                .mapToDouble(taxes::calculateTax)
                .sum();
    }

    @Override
    public Collection<Person> findCitizensBy(PersonPredicate personPredicate) {
        return population.stream()
                .filter(personPredicate::test)
                .collect(Collectors.toList());
    }


    @Override
    public Collection<Person> getOrderedCitizens() {
        return population.stream()
                .sorted(Comparator.comparing(Person::getLastName)
                        .thenComparing(Person::getFirstName))
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Person>> groupByYearOfBirth() {
        return population.stream()
                .collect(Collectors.groupingBy(c -> c.getDateOfBirth()
                        .getYear()));
    }
}
