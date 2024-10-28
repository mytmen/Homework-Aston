public abstract class Animal {
    private static int count = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getCount() {
        return count;
    }
}
class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.printf("%s пробежал %d м.%n", name, distance);
        } else {
            System.out.printf("%s не может пробежать %d м.%n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.printf("%s проплыл %d м.%n", name, distance);
        } else {
            System.out.printf("%s не может проплыть %d м.%n", name, distance);
        }
    }
}
class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0; // Коты не умеют плавать
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.printf("%s пробежал %d м.%n", name, distance);
        } else {
            System.out.printf("%s не может пробежать %d м.%n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать.%n", name);
    }

    public boolean eat(FoodBowl bowl) {
        if (bowl.getFoodAmount() > 0) {
            bowl.decreaseFood(1); // Кот ест 1 порцию
            isFull = true;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return isFull;
    }
}
class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0); // Не допускаем отрицательного количества еды
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }

    public void decreaseFood(int amount) {
        if (amount > 0 && foodAmount >= amount) {
            foodAmount -= amount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}