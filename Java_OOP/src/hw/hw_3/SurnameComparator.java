package hw.hw_3;

import java.util.Comparator;

/**
 * Сортировка по Фамилии в алфавитном порядке
 */
public class SurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.surName.compareTo(o2.surName);
    }

}
