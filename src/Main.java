public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задание1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        System.out.println("Задание2:");

        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpper = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
    }

    private static void task3() {
        System.out.println("Задание3:");

        String fullName = "Иванов Семён Семёнович";
        String fullNameCorrect = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника — " + fullNameCorrect);
    }
}