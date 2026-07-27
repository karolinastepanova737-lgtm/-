public class Main {
    public static void main(String[] args) {

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

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capaityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capaityLeft + " кг вещей");

    }
}