import java.util.Scanner;

public class Person {
    int id,age;
    String name;
    Animal[] animals;
    Technique[] techniques;

    public Person(int id, int age, String name, Animal[] animals, Technique[] techniques) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.animals = animals;
        this.techniques = techniques;
    }

}
