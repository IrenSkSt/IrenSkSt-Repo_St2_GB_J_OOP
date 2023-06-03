package hw.hw_7;

public class PlatformJobAgency {

    public static void runPlatform() {

        JobAgency jobAgency = new JobAgency();

        Company company1 = new Company("GeekBrains", 70, jobAgency);
        Company company2 = new Company("Google", 150, jobAgency);
        Company company3 = new Company("Yandex", 200, jobAgency);

        Student student1 = new Student("Иванов");
        Junior junior1 = new Junior("Петров");
        Master master1 = new Master("Сидоров");

        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(junior1);
        jobAgency.registerObserver(student1);

    }

}
