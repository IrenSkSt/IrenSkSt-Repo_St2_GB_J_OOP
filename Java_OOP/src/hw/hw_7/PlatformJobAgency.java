package hw.hw_7;

public class PlatformJobAgency {

    public static void runPlatform() {
        /** Кадровое агенство */
        JobAgency jobAgency = new JobAgency();

        /** Компании-работодатели */
        Company company1 = new Company("GeekBrains", 70, jobAgency);
        Company company2 = new Company("Google", 150, jobAgency);
        Company company3 = new Company("Yandex", 200, jobAgency);

        /** Соискатели */
        Student student1 = new Student("Иванов", PROFESSION.Project);
        Junior junior1 = new Junior("Петров", PROFESSION.Programmer);
        Master master1 = new Master("Сидоров", PROFESSION.Product);
        Master master2 = new Master("Волков", PROFESSION.Programmer);

        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(junior1);
        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master2);

        jobAgency.showListObservers(); // для проверки

        // for (int i = 0; i < 10; i++) {
        // company1.needEmployee();
        // company2.needEmployee();
        // company3.needEmployee();
        // }

        /** Рассылка вакансий и отклики соискателей */
        System.out.println("Отклики соискателей по вакансиям: ".toUpperCase());
        company1.createVacancy(PROFESSION.Project, POSITION.Entern);
        company1.createVacancy(PROFESSION.Programmer, POSITION.Junior);
        company1.createVacancy(PROFESSION.Product, POSITION.Junior);
        company2.createVacancy(PROFESSION.Programmer, POSITION.Master);
        company2.createVacancy(PROFESSION.Programmer, POSITION.Junior);
        company2.createVacancy(PROFESSION.Project, POSITION.Entern);
        company2.createVacancy(PROFESSION.Product, POSITION.Master);
        company3.createVacancy(PROFESSION.Product, POSITION.Master);
        company3.createVacancy(PROFESSION.Programmer, POSITION.Master);
        company3.createVacancy(PROFESSION.Programmer, POSITION.Junior);
        company3.createVacancy(PROFESSION.Programmer, POSITION.Entern);

    }

}
