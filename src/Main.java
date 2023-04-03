public class Main {
    public static void main(String[] args) {
//------------------------------------------Задача 1
        System.out.println("\n" + "Задача №1" + "\n");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("ФИО сотрудника - " + middleName + " " + firstName + " " + lastName);

//-------------------------------------------Задача 2
        System.out.println("\n" + "Задача №2" + "\n");

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

//-------------------------------------------Задача 3
        System.out.println("\n" + "Задача №3" + "\n");

        String fullName1 = "Иванов Семён Семёнович";

        System.out.println("Данные ФИО сотрудника — " + fullName1.replace('ё', 'е'));
    }
}