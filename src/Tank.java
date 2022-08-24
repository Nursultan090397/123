public class Tank extends Technique{
    public Tank(int id, int year, String name, String model) {
        super(id, year, name, model);
    }

    @Override
    public void oils() {
        System.out.println("Salyarka kuyat jana bat korotot");
    }

    @Override
    public void capacity() {
        System.out.println("2");
    }
}
