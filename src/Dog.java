public class Dog extends Animal{
    public Dog(int id, int age, String name, double weight, boolean domasticAnimal) {
        super(id, age, name, weight, domasticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Bat churkait");
    }

    @Override
    public void eats() {
        System.out.println("Et jeyt");
    }

    @Override
    public void heLive() {
        System.out.println("Uydo jawayt");
    }
}
