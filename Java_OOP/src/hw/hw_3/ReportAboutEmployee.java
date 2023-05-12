package hw.hw_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ReportAboutEmployee {

    public static Employee[] sortEmployees = new Employee[ListEmployees.employees.length];

    public static void CreateReports() {

        // Worker w1 = new Worker("Иван", "Иванов", 1978, 100); // для проверки
        // System.out.println(w1); // для проверки

        // Freelancer wf1 = new Freelancer("Алексей", "Алексеев", 1995, 0.97); // для
        // проверки
        // System.out.println(wf1); // для проверки

        ListEmployees.generateNewEmployee();

        ListEmployees.showListEmployee();

        sortEmployees = ListEmployees.employees.clone();

        /** Всех работников отсортировали по Фамилии в алфавитном порядке */
        Arrays.sort(sortEmployees, new SurnameComparator());
        showSortListAllEmpl("Фамилии в алфавитном порядке");

        /** Всех работников отсортировали по году рождения по возрастанию */
        Arrays.sort(sortEmployees, new YearBornComparator());
        showSortListAllEmpl("Год рождения по возрастанию");

        /** Всех работников отсортировали по ср.мес.ЗП по убыванию */
        Arrays.sort(sortEmployees);
        showSortListAllEmpl("ЗП за месяц по убыванию");
        // ListEmployees.showListEmployee(); // для проверки
    }

    public static void showSortListAllEmpl(String paramSort) {

        System.out.println("\nСписок работников  ".toUpperCase() + "- сортировка по признаку: " + paramSort);
        for (Employee employee : sortEmployees) {
            System.out.println(employee);
        }
        // System.out.printf("ВСЕГО работников: %d \n", Employee.getCount());

    }
}
