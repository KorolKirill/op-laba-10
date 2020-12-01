import java.util.ArrayList;

public class Institute implements Information{
    private ArrayList<Faculty> faculties = new ArrayList<>();
    private final String name;

    public Institute(String name, ArrayList<Faculty> faculties) {
        this.faculties = faculties;
        this.name = name;
    }

    public Institute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //Этот метод проверяет факультеты на ссылки в памяти, а тут бы лучше сделать что бы проверяло по названию
    // Сделал для того что бы нельзя было добавить два одинкаковых факультета
    public void add(Faculty faculty) {
        if (faculties.contains(faculty)) {
            System.out.println("Ошибка это факультет уже принадлежит институту");
        }
        else {
            faculties.add(faculty);
        }
    }
    // Функция которая считает сколько всего учиться студентов Задание 3)
    public int countStudents() {
        int quantity = 0;
        for (Faculty faculty:faculties) {
            quantity += faculty.countStudents();
        }
        return quantity;
    }

    // Функция которая смотрит где больше всего студентов Задание 2)
    public String mostStudents() {
        Faculty answer = null;
        String nullAnwer = "В инстритуте нету факультетов или количество студентов в факультетах равно 0";
        int tempStudents = 0;
        for (Faculty faculty : faculties) {
            if (faculty.countStudents()>tempStudents) {
                tempStudents = faculty.countStudents();
                answer = faculty;
            }
        }
        return answer == null? nullAnwer : "Это факультет: " + answer.getName();
    }

    // Фукнция которая ищет лучших студентов Задание 3)
    private ArrayList<Student> bestStudents() {
        ArrayList<Student> bestStudents = new ArrayList<>();
        for (Faculty faculty: faculties) {
            for (Student student :faculty.getStudents()) {
                if (student.getGPA()>=95) {
                    bestStudents.add(student);
                }
            }
        }
        return bestStudents;
    }
    // Функция возвращает список лучших студентов с их именнами как Строку.
    public String showBestStudents() {
        ArrayList<String> bestStudents = new ArrayList<>();
        for (Student student: bestStudents()) {
            bestStudents.add(student.getName());
        }
        return bestStudents.toString();
    }
    //Метод ищет студента по номеру заликовки
    // Тут бы добавить еще проверку на правильность введения номер зачетки
    public void findStudent(String markBookIndex) {

        for (Faculty faculty: faculties) {
            for (Student student: faculty.getStudents()){
                if (student.getMarkBookIndex().equals(markBookIndex)) {
                    System.out.println("Студент по запросу: "+markBookIndex+" найден. Вот информация:");
                    student.getInformation();
                    return;
                }
            }
        }
        System.out.println("Студент по запросу:" +markBookIndex+ " не найден.");
    }

    @Override
    public void getInformation() {
        System.out.println(
                "Вся информация о Институте:" +
                        "\nНазвание: " + name +
                        "\nФакультеты: " +faculties.toString() + //Здесь надо сделать нормальное отображение факультетов.
                        "\nКоличество учеников: " +countStudents()
        );
    }
}
