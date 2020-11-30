public class Main {
    public static void main(String[] args) {

        Institute kpi = new Institute("KPI");
        Faculty FICT = new Faculty("FICT");
        Faculty IPSA = new Faculty("IPSA");
        Student korol = new Student("Korol Kirill","AC555555",87.3);
        Student bukreev = new Student("Bukreev Nikita", "AC666666",98.3);
        Student borya = new Student("Sosnoviy Bor","AC77777777",95.6);
        Student goncharov = new Student("Goncharov Anton","AE333333",75.3);
        Student ivanov = new Student("Ivanov Ivan","AE666666",95);

        IPSA.add(goncharov); IPSA.add(ivanov);
        FICT.add(korol); FICT.add(bukreev); FICT.add(borya);

        kpi.add(IPSA); kpi.add(FICT);

        System.out.println(kpi.showBestStudents());
        System.out.println(kpi.countStudents());
        System.out.println(kpi.mostStudents());


    }
}
