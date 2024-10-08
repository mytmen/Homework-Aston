public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 35);
        employeesArray[2] = new Employee("Sidorov Sidor", "Analyst", "sidorov@mailbox.com", "892312314", 50000, 28);
        employeesArray[3] = new Employee("Kuznetsov Kuzya", "Designer", "kuzya@mailbox.com", "892312315", 35000, 29);
        employeesArray[4] = new Employee("Smirnov Semyon", "Developer", "smirnov@mailbox.com", "892312316", 45000, 32);

        for (Employee employee : employeesArray) {
            employee.displayInfo();
        }

        Park amusementPark = new Park("Развлекательный парк", 3);

        amusementPark.addAttraction(0, "Американские горки", "10:00 - 22:00", 500);
        amusementPark.addAttraction(1, "Колесо обозрения", "10:00 - 20:00", 300);
        amusementPark.addAttraction(2, "Поездка на поезде", "10:00 - 18:00", 200);

        amusementPark.displayAttractions();
    }
}