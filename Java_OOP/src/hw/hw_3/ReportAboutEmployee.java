package hw.hw_3;

public class ReportAboutEmployee {

    public static void CreateReports() {

        Worker w1 = new Worker("Иван", "Иванов", 100); // для проверки
        System.out.println(w1); // для проверки

        Freelancer wf1 = new Freelancer("Алексей", "Алексеев", 0.2);
        System.out.println(wf1);

    }

}
