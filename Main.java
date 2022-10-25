import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        Random rand = new Random();

        AbstractFactory absFactory = new AbstractFactory();
        BaseFactory factory = absFactory.getFactory(rand.nextInt(2));

        Triangle tr = factory.createTriangle(12, 16, 20); // creating a tringle using abstract factory
        Circle c = factory.createCircle(5); // creating a circle using abstract factory

        System.out.print(tr.toString());
        System.out.print("Triangle perimeter is: ");
        System.out.println(tr.getPerimeter());
        System.out.print("Triangle area is: ");
        System.out.println(tr.getArea());
        System.out.println("-----------------------------");

        System.out.print(c.toString());
        System.out.print("Circle perimeter is: ");
        System.out.println(c.getPerimeter());
        System.out.print("Circle area is: ");
        System.out.println(c.getArea());


    }
}