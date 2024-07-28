public class Worker {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;


    public Worker(String fullName, String position, String email, String phone, double salary, int age) {
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

        Worker[] persArray = new Worker[5];


        persArray[0] = new Worker("Иванов Иван Иванович", "Инженер", "ivanov@mail.com", "892312312", 30000, 30);
        persArray[1] = new Worker("Петров Петр Петрович", "Программист", "petrov@mail.com", "892312311", 50000, 28);
        persArray[2] = new Worker("Сидоров Сидор Сидорович", "Менеджер", "sidorov@mail.com", "892312310", 45000, 35);
        persArray[3] = new Worker("Алексеев Алексей Алексеевич", "Дизайнер", "alekseev@mail.com", "892312309", 40000, 32);
        persArray[4] = new Worker("Ильин Илья Ильич", "Тестировщик", "il'yn@mail.com", "892312308", 35000, 27);


        for (Worker worker : persArray) {
            worker.printInfo();
        }
    }
}