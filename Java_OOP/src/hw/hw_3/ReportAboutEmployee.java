package hw.hw_3;

import java.time.Year;
import java.util.Arrays;

public class ReportAboutEmployee {

    public static Employee[] sortEmployees = new Employee[ListEmployees.employees.length];
    public static Worker[] sortWorkers = new Worker[Worker.getCount()];

    public static void CreateReports() {

        // Worker w1 = new Worker("Иван", "Иванов", 1978, 100); // для проверки
        // System.out.println(w1); // для проверки

        // Freelancer wf1 = new Freelancer("Алексей", "Алексеев", 1995, 0.97); // для
        // проверки
        // System.out.println(wf1); // для проверки

        ListEmployees.generateNewEmployee();

        ListEmployees.showListEmployee();

        /** Отчет с сортировкой по списку всех работников */
        sortEmployees = ListEmployees.employees.clone();

        /** Всех работников отсортировали по Фамилии в алфавитном порядке */
        Arrays.sort(sortEmployees, new SurnameComparator());
        showSortListAllEmpl("Фамилии в алфавитном порядке");

        /** Всех работников отсортировали по ср.мес.ЗП по убыванию */
        Arrays.sort(sortEmployees);
        showSortListAllEmpl("ЗП за месяц по убыванию");
        // ListEmployees.showListEmployee(); // для проверки

        /** Всех работников отсортировали по году рождения по возрастанию */
        Arrays.sort(sortEmployees, new YearBornComparator());
        showSortListAllEmpl("Год рождения по возрастанию");

        /** Список штатных сотрудников (т.е. без фрилансеров) моложе 30 лет */
        if (Worker.getCount() > 0) {
            System.out.printf("Список штатных сотрудников младше 30 лет (с %d года рождения): \n",
                    Year.now().getValue() - 30);
            int m = 0;
            for (Employee employee : sortEmployees) {
                if (employee instanceof Worker && employee.yearBorn >= (Year.now().getValue() - 30)) {
                    sortWorkers[m++] = (Worker) employee;
                    // System.out.println(m + " " + employee); // для проверки
                    // System.out.println(m + " " + sortWorkers[m]); // для проверки
                }
            }
            if (m - 1 > 1)
                Arrays.sort(sortWorkers);
            for (Employee worker : sortWorkers) {
                System.out.println(worker);
            }
            System.out.println("Итого сотрудников 30 лет и моложе: " + m);
        }

        /** Список сотрудников в штате предпенсионного и пенсионного возраста */
        ListPrePensionAge.createListPrePensionAge();
        ListPrePensionAge.showListPrePensionAge();
    }

    public static void showSortListAllEmpl(String paramSort) {

        System.out.println("\nСписок работников  ".toUpperCase() + "- сортировка по признаку: " + paramSort);
        for (Employee employee : sortEmployees) {
            if (employee != null)
                System.out.println(employee);
        }
        // System.out.printf("ВСЕГО работников: %d \n", Employee.getCount());

    }
}
