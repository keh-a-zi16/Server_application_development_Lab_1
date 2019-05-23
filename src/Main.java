import java.util.Random;
//import java.util.Scanner;
//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setTun(), getTun(), toString().
// Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и
// вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//        Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
//        Создать массив объектов, Вывести:
//        а) список абитуриентов, имеющих неудовлетворительные оценки;
//        б) список абитуриентов, у которых сумма баллов выше заданной;
//        в) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов (вывести также полный список
//        абитуриентов, имеющих полупроходную сумму.)

//Все имена, фамилии и адреса выдуманы, любые совпадения случайны
public class Main {

    private static Abiturient[] abiturients;
    private static final String[] lastName = {
            "Акулиненко",
            "Беспалый",
            "Мирошниченко",
            "Захарчук",
            "Кех",
            "Котляров",
            "Мамадиев",
            "Меназизов"
    };
    private static final String[] firstName = {
            "Сергей",
            "Владислав",
            "Родион",
            "Андрей",
            "Александр",
            "Александр",
            "Ильяс",
            "Алим"
    };
    private static final String[] middleName = {
            "Игоревич",
            "Вячеславович",
            "Андреевич",
            "Викторович",
            "Викторович",
            "Анатольевич",
            "Аблитарович",
            "Ленурович"
    };
    private static final String[] address = {
            "просп. Гагарина, 56",
            "ул. Попова, 67",
            "просп. Лермонтова, 5",
            "ул. Шевченко, 88",
            "ул. Достоевского, 53",
            "ул. Киевская, 120",
            "просп. Победы, 46",
            "ул. Македонская, 28.23"
    };

    public static void abiturientsList() {
        Random r = new Random();
        abiturients = new Abiturient[8];
        for (int i = 0; i < abiturients.length; i++) {
            Abiturient abiturient = new Abiturient();
            abiturient.setFirstName(firstName[r.nextInt(8)]);
            abiturient.setLastName(lastName[r.nextInt(8)]);
            abiturient.setMiddleName(middleName[r.nextInt(8)]);
            abiturient.setAddress(address[r.nextInt(8)]);
            abiturient.setPhoneNumber("+7(978)" + (((int) (Math.random() * 10000000) + 1)));
            abiturient.setEstimates(r.nextInt(4) + 2);
            abiturients[i] = abiturient;
        }
    }

    public static void printListAbiturients() {
        System.out.println("Список абитуриентов");
        for (Abiturient c : abiturients) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        abiturientsList();
        printListAbiturients();
        printListAbiturientsInSummEstimatesLowAndHig(3, 5, 3);
    }

    public static void printListAbiturientsInSummEstimatesLowAndHig(int low, int hight, int middle) {
        System.out.println();
        System.out.println("Cписок абитуриентов, имеющих неудовлетворительные оценки");
        for (Abiturient c : abiturients) {
            if (c.getEstimates() < low) {
                System.out.println(c);
            }
        }
        System.out.println();
        System.out.println("Cписок абитуриентов, у которых сумма баллов выше заданной");
        for (Abiturient c : abiturients) {
            if (c.getEstimates() > middle) {
                System.out.println(c);
            }
        }
        System.out.println();
        System.out.println("Cписок абитуриентов, имеющих полупроходную сумму");
        for (Abiturient c : abiturients) {
            if (c.getEstimates() == middle) {
                System.out.println(c);
            }
        }
        System.out.println();
        System.out.println("Cписок абитуриентов, имеющих самую высокую сумму баллов");
        for (Abiturient c : abiturients) {
            if (c.getEstimates() == hight) {
                System.out.println(c);
            }
        }

    }
}
