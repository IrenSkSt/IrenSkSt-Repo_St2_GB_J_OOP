package hw.hw_3;

import java.time.Year;
import java.util.Arrays;

public class ListPrePensionAge {

    public static Worker[] listPrePensionAgeWorkers = new Worker[Worker.getCount()];
    public static final int minPrePensionAge = 58;

    public static void createListPrePensionAge() {

        int i = 0;
        for (Employee employee : ListEmployees.employees) {

            // System.out.println(employee.getClass()); // для проверки
            if (employee instanceof Worker && employee.yearBorn <= (Year.now().getValue() - minPrePensionAge)) {
                listPrePensionAgeWorkers[i++] = (Worker) employee;
            }
        }
        if (i - 1 > 1)
            Arrays.sort(listPrePensionAgeWorkers, new YearBornComparator());
    }

    public static void showListPrePensionAge() {
        System.out.println("\nСписок работников: ".toUpperCase() + "предпенсионного и пенсионного возраста");
        int j = 0;
        for (Worker worker : listPrePensionAgeWorkers) {
            if (worker != null)
                System.out.println(++j + " " + worker);
        }
        System.out.printf("ВСЕГО в штате работников предпенсионного и пенсионного возраста (%d лет и старше): %d\n",
                minPrePensionAge, j);
    }

}
