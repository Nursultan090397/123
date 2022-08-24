public class Bayraktar extends Technique implements CanDo{
    public Bayraktar(int id, int year, String name, String model) {
        super(id, year, name, model);
    }
    @Override
    public void oils() {
        System.out.println("Benzin kuyat jana norma korotot");
    }

    @Override
    public void capacity() {
        System.out.println("5");
    }

    @Override
    public void fly() {
        System.out.println("Uchat");
    }
}
