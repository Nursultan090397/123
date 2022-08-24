public class Cat extends Animal{
    public Cat(int id, int age, String name, double weight, boolean domasticAnimal) {
        super(id, age, name, weight, domasticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Chychkan karmagany churkait");
    }

    @Override
    public void eats() {
        System.out.println("Korm jeyt");
    }

    @Override
    public void heLive() {
        System.out.println("Uydo jawayt");
    }
}
