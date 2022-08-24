public class Eagle extends Animal implements CanDo{
    public Eagle(int id, int age, String name, double weight, boolean domasticAnimal) {
        super(id, age, name, weight, domasticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Bat uchat");
    }

    @Override
    public void eats() {
        System.out.println("Koyon jeyt");
    }

    @Override
    public void heLive() {
        System.out.println("Toodo jawayt");
    }

    @Override
    public void fly() {
        System.out.println("Ayabay bat yldamdykta");
    }
}
