import Work3.DefaultGreetingService;
import Work3.FormalGreeting;
import Work3.GreetingService;
import work1.Quadrangle;
import work1.Rectangle;
import work1.Square;

public class Main {
    public static void main(String[] args) {
        work1();
        /** Work2 - см. комментарий в интерфейсе ReportGenerator
         */
        work3();
    }

    public static void work1() {
        Rectangle rectangle = new Rectangle();
        /**
         *  Проверим ширину и высоту Прямоугольника: ожидаем, что оба должны вернуть true
         */
        testRectangle(rectangle);

        Square square = new Square();
        /**
         *  Проверим, что Квадрат отвечает принципу подстановки Б. Лисков (LSP).
         * Результат 'false' будет означать, что LSP не удовлетворяется.
         */
        testRectangle(square);

        /**
         *  Выводы:
         * В результате есть 'false' - означает, что Квадрат не является наследником Прямоугольника.
         * Мы поменяли реализацию на зависимость от интерфейсов.
         */
    }

    public static void work3() {
        /**
         * Реализация без нарушения принципа единой ответственности и принципа открытости/закрытости.
         */
        GreetingService greetingService = new DefaultGreetingService();
        System.out.println(greetingService.greet());

        greetingService.setGreeting(new FormalGreeting());
        System.out.println(greetingService.greet());
    }

    public static void testRectangle(Quadrangle quadrangle) {
        quadrangle.setHeight(10);
        quadrangle.setWidth(20);
        System.out.println(quadrangle.getHeight() == 10 && quadrangle.getWidth() == 20);
    }
}