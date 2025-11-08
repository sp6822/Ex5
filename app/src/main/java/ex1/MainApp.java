package ex1;
public class MainApp
{
    public static void main(String[] args)
    {
        Chargeable[] devices = {
                new Phone("Samsung Galaxy S23 Ultra"),
                new Tablet("Microsoft Surface Pro"),
                new Laptop("Dell XPS 13")
        };
        for (Chargeable device : devices)
        {
            device.charge();
        }
    }
}