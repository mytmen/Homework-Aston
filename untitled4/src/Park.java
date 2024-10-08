class Park {
    private String name;
    private Attraction[] attractions;

    public Park(String name, int capacity) {
        this.name = name;
        this.attractions = new Attraction[capacity];
    }

    public void addAttraction(int index, String attractionName, String workingHours, double price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(attractionName, workingHours, price);
        } else {
            System.out.println("Индекс вне диапазона.");
        }
    }

    public void displayAttractions() {
        System.out.println("Аттракционы в парке " + name + ":");
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.displayInfo();
            }
        }
    }

    // Внутренний класс Attraction
    class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
            System.out.println("-----------------------");
        }
    }
}
