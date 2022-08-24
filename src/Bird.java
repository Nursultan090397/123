public class Bird extends  Animal implements CanDo{
    public Bird(int id, int age, String name, double weight, boolean domasticAnimal) {
        super(id, age, name, weight, domasticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Uchat");
    }

    @Override
    public void eats() {
        System.out.println("Kurt-kumurska jeyt");
    }

    @Override
    public void heLive() {
        System.out.println("Tokoydo jawayt");
    }
    @Override
    public void fly() {
        System.out.println("Biraz uchat");
    }
}
