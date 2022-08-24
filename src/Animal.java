public abstract class  Animal {
    int id,age;
    String name;
    double weight;
    boolean domasticAnimal;

    public Animal(int id, int age, String name, double weight, boolean domasticAnimal) {
        this.id = id;
        if (age>0) {
            this.age = age;
        }
        else System.out.println("Ters san beruugo bolboyt!");
        if (name.length()>2){
            this.name = name;
        }
        else System.out.println("Atyn tuura emes berip jatasyz");
        this.weight = weight;
        this.domasticAnimal = domasticAnimal;
    }
    public abstract void run();
    public abstract void eats();
    public abstract void heLive();



    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isDomasticAnimal() {
        return domasticAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                " age=" + age +
                " name='" + name + '\'' +
                " weight=" + weight +
                " domasticAnimal=" + domasticAnimal +
                '}' + '\n';
    }
}