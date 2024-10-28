public class Main {

    public static void main(String[] args) {

        // Часть 1: Животные
        Animal[] animals = new Animal[]{
                new Dog("Рекс"),
                new Cat("Мурка"),
                new Dog("Шарик"),
                new Cat("Барсик")
        };

        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(5);
        }

        System.out.printf("Всего животных создано: %d%n", Animal.getCount());

        // Часть 2: Коты и миска с едой
        FoodBowl bowl = new FoodBowl(5);

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                if (cat.eat(bowl)) {
                    System.out.printf("%s покушал и теперь сыт.%n", cat.name);
                } else {
                    System.out.printf("%s не смог покушать — еды не хватило.%n", cat.name);
                }
            }
        }

        // Часть 3: Геометрические фигуры
        Shape[] shapes = new Shape[]{
                new Circle(5, "Красный", "Черный"),
                new Rectangle(4, 6, "Синий", "Зеленый"),
                new Triangle(3, 4, 5, "Желтый", "Фиолетовый")
        };

        for (Shape shape : shapes) {
            System.out.printf("Фигура: %s, Периметр: %.2f, Площадь: %.2f, Цвет заливки: %s, Цвет границы: %s%n",
                    shape.getClass().getSimpleName(),
                    shape.perimeter(),
                    shape.area(),
                    shape.getFillColor(),
                    shape.getBorderColor());
        }

    }
}