public class Park {

    private Attraction[] attractions;
    private int attractionCount;


    public Park(int maxAttractions) {
        attractions = new Attraction[maxAttractions];
        attractionCount = 0;
    }


    public class Attraction {
        private String name;
        private String workingHours;
        private double price;


        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }


        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println();
        }
    }


    public void addAttraction(String name, String workingHours, double price) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount++] = new Attraction(name, workingHours, price);
        } else {
            System.out.println("Не удалось добавить аттракцион. Максимальное количество аттракционов достигнуто.");
        }
    }


    public void printAllAttractions() {
        for (int i = 0; i < attractionCount; i++) {
            attractions[i].printInfo();
        }
    }


    public static void main(String[] args) {

        Park park = new Park(5);


        park.addAttraction("Американские горки", "10:00 - 22:00", 300);
        park.addAttraction("Колесо обозрения", "09:00 - 21:00", 250);
        park.addAttraction("Детская карусель", "10:00 - 20:00", 150);
        park.addAttraction("Прыжки с высоты", "12:00 - 18:00", 500);
        park.addAttraction("Лабиринт", "10:00 - 19:00", 200);


        park.printAllAttractions();
    }
}