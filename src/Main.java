public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        // Добавляем записи
        pb.add("Иванов", "123-456");
        pb.add("Петров", "987-654");
        pb.add("Сидоров", "555-555");
        pb.add("Иванов", "111-222");
        pb.add("Петров", "333-444");

        // Получаем номера по фамилии
        System.out.println("Телефоны Иванова: " + pb.get("Иванов"));
        System.out.println("Телефоны Петрова: " + pb.get("Петров"));
        System.out.println("Телефоны Сидорова: " + pb.get("Сидоров"));
        System.out.println("Телефоны Смирнова: " + pb.get("Смирнов")); // Не существует
    }
}