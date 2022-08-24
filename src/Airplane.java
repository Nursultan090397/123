public class Airplane extends Technique implements CanDo{
    public Airplane(int id, int year, String name, String model) {
        super(id, year, name, model);
    }

    @Override
    public void fly() {
        System.out.println("Oto bat uchat");
    }

    @Override
    public void oils() {
        System.out.println("Benzin kuyat jana bat korotot");
    }

    @Override
    public void capacity() {
        System.out.println("100");
    }
}
