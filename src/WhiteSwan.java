public class WhiteSwan extends Animal implements CanDo{
    public WhiteSwan(int id, int age, String name, double weight, boolean domasticAnimal) {
        super(id, age, name, weight, domasticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Bat suzot");
    }

    @Override
    public void eats() {
        System.out.println("Balyk jeyt");
    }

    @Override
    public void heLive() {
        System.out.println("Suuda jawayt");
    }

    @Override
    public void fly() {
        System.out.println("Biraz uchat");

    }
}
