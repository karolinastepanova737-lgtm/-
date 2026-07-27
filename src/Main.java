public class Main {
    public static void main(String[] args) {

        // задача с коробками
        var box = 5;
        System.out.println(box);
        box = 2 + box;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        // задача с весом
        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capaityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capaityLeft + " кг вещей");

        // задача с яблоками
        var applesWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = applesWeight + orangesWeight;
        System.out.println("Общий вес фркутов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var pepersWeight = 2;
        var kabachokWeight = 2;

        // вес овощей и вес всех продуктов

        var vegetablesWeight = tomatoesWeight + cucumbersWeight + pepersWeight + kabachokWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;

        System.out.println("Общий весОбщий вес продуктов " + productsWeight + " кг");


        // считаем сколько места осалось в машине

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Общий весМеста осталось "+ leftWeight + " кг!");

        // Добавляем еще друзей

        productsWeight = productsWeight * 2;
        System.out.println("Общий вес продуктов с друзьями составляет " + productsWeight + " кг");

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Из - за друзей у нас остается только " + leftWeight + " кг свободного места");




    }
}