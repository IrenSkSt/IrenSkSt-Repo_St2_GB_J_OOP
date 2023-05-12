package hw.hw_3;

import java.util.Comparator;

/**
 * Сортировка по году рождения по возрастанию
 */
public class YearBornComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return Integer.compare(o1.yearBorn, o2.yearBorn);
    }

}
