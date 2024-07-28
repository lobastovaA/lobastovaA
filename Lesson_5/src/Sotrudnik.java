public class Sotrudnik {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;


    public Sotrudnik(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }


    public static void main(String[] args) {

        Sotrudnik sotrudnik1 = new Sotrudnik("Иванов Иван Иванович", "Менеджер", "ivanov@mail.com", "123-456-7890", 50000, 30);
        Sotrudnik sotrudnik2 = new Sotrudnik("Петров Петр Петрович", "Программист", "petrov@mail.com", "098-765-4321", 70000, 28);


        sotrudnik1.printInfo();
        sotrudnik2.printInfo();
    }
}