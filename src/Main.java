public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача1
        System.out.println("Задача1");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastame = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastame;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        //Задача2
        System.out.println("Задача2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        //Задача3
        System.out.println("Задача3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);
    }
}