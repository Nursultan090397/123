public class Helicopter extends Technique implements CanDo{
    public Helicopter(int id, int year, String name, String model) {
        super(id, year, name, model);
    }

    @Override
    public void fly() {
        System.out.println("Batyraak uchat");
    }

    @Override
    public void oils() {
        System.out.println("Benzin kuyat bat korotot");
    }

    @Override
    public void capacity() {
        System.out.println("4");
    }
}