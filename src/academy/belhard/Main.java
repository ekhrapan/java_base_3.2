package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        box1.depth = 1;
        box1.height = 2;
        box1.width = 3;

        int volume1 = box1.width * box1.height * box1.depth;
        System.out.println("Объем коробки №1 = " + volume1);

        // ... создайте еще 1 объект типа Box,
        // заполните его свойства,
        // расчитайте объем и выведите на консоль
    }
}
