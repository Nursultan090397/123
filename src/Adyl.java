import java.util.Arrays;

public class Adyl extends Person{
    public Adyl(int id, int age, String name, Animal[] animals, Technique[] techniques) {
        super(id, age, name, animals, techniques);
    }

    @Override
    public String toString() {
        return "Asan{" +
                "id=" + id +
                " age=" + age +
                " name='" + name + '\n' +
                " animals=" + Arrays.toString(animals) + '\n' +
                " techniques=" + Arrays.toString(techniques) +
                '}';
    }
}
