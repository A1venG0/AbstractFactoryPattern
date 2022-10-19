public class Main
{

    public static void main(String[] args)
    {
        BaseFactory factory;

        // choose between white and black factories

        factory = new WhiteFactory();

        //factory = new BlackFactory();

        Triangle tr;
        Circle c;
        tr = factory.createTriangle();
        c = factory.createCircle();

        System.out.println(tr.toString());

        System.out.println(c.toString());
    }
}