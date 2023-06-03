package hw.hw_7;

public class PlatformJobAgency {

    public static void runPlatform() {

        JobAgency jobAgency = new JobAgency();

        Company company1 = new Company("GeekBrains", 70, jobAgency);
        Company company2 = new Company("Google", 150, jobAgency);
        Company company3 = new Company("Yandex", 200, jobAgency);

    }

}
