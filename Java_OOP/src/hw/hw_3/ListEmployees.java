package hw.hw_3;

import java.util.Random;

public class ListEmployees {

    public static Employee[] employees = new Employee[10];

    private static Random random = new Random();
    private static String[] names = new String[] { "Алексей", "Андрей", "Иван", "Денис", "Роман", "Семен", "Кирилл",
            "Матвей", "Максим" };
    private static String[] surNames = new String[] { "Алексеев", "Иванов", "Кузнецов", "Петров", "Сидоров",
            "Макаров", "Соболев", "Доронин", "Волков", "Васильев", "Афанасьев", "Шестаков", "Щербаков" };

    public static void generateNewEmployee() {

        for (int i = 0; i < employees.length; i++) {
            int contract = random.nextInt(2);
            switch (contract) {
                case 0:
                    employees[i] = newWorker();
                    // System.out.println(employees[i]); // для проверки
                    break;

                default:
                    employees[i] = newFreelancer();
                    // System.out.println(employees[i]); // для проверки
                    break;
            }
        }

    }

    private static Worker newWorker() {
        int yearBorn = random.nextInt(1960, 2000);
        int salary = random.nextInt(50, 180);
        return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(names.length)], yearBorn,
                salary);
    }

    private static Freelancer newFreelancer() {
        int yearBorn = random.nextInt(1970, 1995);
        int salary = (int) (100 * random.nextInt(30, 80) / 20 / 8);
        return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(names.length)], yearBorn,
                (double) salary / 100);
    }

    public static void showListEmployee() {
        System.out.println("\nСписок работников: ".toUpperCase());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.printf("ВСЕГО работников: %d чел.\n", Employee.getCount());
        if (Employee.getCount() > 1)
            System.out.printf("в том числе в штате: %d чел., на фрилансе (за штатом): %d чел.\n", Worker.getCount(),
                    Freelancer.getCount());

    }

}
