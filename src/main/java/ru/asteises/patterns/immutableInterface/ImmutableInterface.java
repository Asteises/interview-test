package main.java.ru.asteises.patterns.immutableInterface;

public class ImmutableInterface {

    public static void main(String[] args) {

        ImmutablePoint2D point = new Point2D(0, 0); // Создаем экземпляр Point2D, который ссылается на интерфейс ImmutablePoint2D;
        int x = point.getX(); // тут все хорошо, так как метод доступен в интерфейсе ImmutablePoint2D;
        // point.setX(42); // метод setX() не существует в типе ImmutablePoint2D;
    }
}
