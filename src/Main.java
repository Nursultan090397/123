import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method3();
    }

    public static void method1() {
        Cat cat1 = new Cat(1, 4, "Margo", 3.45, true);
        Dog dog1 = new Dog(2, 7, "Tuzik", 9.0, true);
        Eagle eagle1 = new Eagle(3, 2, "Eagle1", 12.0, false);
        Eagle eagle2 = new Eagle(4, 2, "Eagle2", 11.8, false);
        Eagle eagle3 = new Eagle(5, 2, "Eagle3", 14.0, false);
        Eagle eagle4 = new Eagle(6, 2, "Eagle4", 11.2, false);
        Eagle eagle5 = new Eagle(7, 2, "Eagle5", 12.3, false);
        WhiteSwan whiteSwan1 = new WhiteSwan(8, 5, "WhiteSwan1", 8.4, false);
        WhiteSwan whiteSwan2 = new WhiteSwan(9, 5, "WhiteSwan2", 9.4, false);
        WhiteSwan whiteSwan3 = new WhiteSwan(10, 5, "WhiteSwan3", 5.4, false);
        Bird bird1 = new Bird(11, 5, "Bird1", 3.1, false);
        Bird bird2 = new Bird(12, 2, "Bird2", 2.1, false);
        Airplane airplane1 = new Airplane(13, 2019, "Airplane1", "Model1");
        Airplane airplane2 = new Airplane(14, 2020, "Airplane2", "Model2");
        Bayraktar bayraktar = new Bayraktar(15, 2020, "Bayraktar1", "Model3");

        Animal[] animals1 = {cat1, dog1, eagle1, eagle2, eagle3, eagle4, eagle5, whiteSwan1, whiteSwan2, whiteSwan3, bird1, bird2};
        Technique[] techniques1 = {airplane1, airplane2, bayraktar};

        Asan asan = new Asan(1180111, 24, "Asan", animals1, techniques1);

        Cat cat2 = new Cat(16, 4, "Moyau", 3.45, true);
        Cat cat3 = new Cat(17, 4, "Mura", 3.45, true);
        Dog dog2 = new Dog(18, 7, "Rex", 7.0, true);
        Eagle eagle6 = new Eagle(19, 2, "Eagle6", 12.0, false);
        Eagle eagle7 = new Eagle(20, 2, "Eagle7", 11.8, false);
        Eagle eagle8 = new Eagle(21, 2, "Eagle8", 14.0, false);
        Eagle eagle9 = new Eagle(22, 2, "Eagle9", 11.2, false);
        Eagle eagle10 = new Eagle(34, 2, "Eagle10", 14.0, false);
        Eagle eagle11 = new Eagle(35, 2, "Eagle11", 11.2, false);
        WhiteSwan whiteSwan4 = new WhiteSwan(23, 5, "WhiteSwan4", 8.4, false);
        WhiteSwan whiteSwan5 = new WhiteSwan(24, 5, "WhiteSwan5", 9.4, false);
        WhiteSwan whiteSwan6 = new WhiteSwan(25, 5, "WhiteSwan6", 5.4, false);
        WhiteSwan whiteSwan7 = new WhiteSwan(26, 5, "WhiteSwan7", 9.4, false);
        WhiteSwan whiteSwan8 = new WhiteSwan(27, 5, "WhiteSwan8", 5.4, false);
        Bird bird3 = new Bird(28, 5, "Bird3", 3.1, false);
        Bird bird4 = new Bird(29, 2, "Bird4", 2.1, false);
        Bayraktar bayraktar1 = new Bayraktar(30, 2021, "Bayraktar2", "Model3");
        Sidan sidan1 = new Sidan(31, 2022, "Sidan1", "Model22");

        Animal[] animals2 = {cat2, cat3, dog2, eagle6, eagle7, eagle8, eagle9, eagle10, eagle11, whiteSwan4, whiteSwan5, whiteSwan6, whiteSwan7, whiteSwan8, bird3, bird4};
        Technique[] techniques2 = {bayraktar1, sidan1};

        Adyl adyl = new Adyl(1180121, 34, "Adyl", animals2, techniques2);


        Cat cat5 = new Cat(37, 4, "Moyau", 3.45, true);
        Cat cat6 = new Cat(38, 4, "Mura", 3.45, true);
        Dog dog5 = new Dog(39, 7, "Rex", 7.0, true);
        Eagle eagle12 = new Eagle(40, 2, "Eagle12", 12.0, false);
        Eagle eagle13 = new Eagle(41, 2, "Eagle13", 11.8, false);
        Eagle eagle14 = new Eagle(42, 2, "Eagle14", 14.0, false);
        Eagle eagle15 = new Eagle(43, 2, "Eagle16", 11.2, false);
        WhiteSwan whiteSwan9 = new WhiteSwan(46, 5, "WhiteSwan9", 8.4, false);
        WhiteSwan whiteSwan10 = new WhiteSwan(47, 5, "WhiteSwan10", 9.4, false);
        Bird bird6 = new Bird(50, 5, "Bird6", 3.1, false);
        Bird bird7 = new Bird(51, 2, "Bird7", 2.1, false);
        Bird bird8 = new Bird(52, 2, "Bird8", 2.1, false);
        Tank tank1 = new Tank(53, 2022, "Tank1", "Model222");
        Tank tank2 = new Tank(54, 2022, "Tank2", "Model242");
        Tank tank3 = new Tank(55, 2022, "Tank3", "Model225");
        Helicopter helicopter1 = new Helicopter(56, 2019, "Helikopter1", "Model123");
        Helicopter helicopter2 = new Helicopter(57, 2021, "Helikopter2", "Model13");
        Helicopter helicopter3 = new Helicopter(58, 2022, "Helikopter3", "Model1753");
        Helicopter helicopter4 = new Helicopter(59, 2019, "Helikopter4", "Model723");
        Helicopter helicopter5 = new Helicopter(60, 2019, "Helikopter5", "Model13");

        Animal[] animals3 = {cat5, cat6, dog5, eagle12, eagle13, eagle14, eagle15, whiteSwan9, whiteSwan10, bird6, bird7, bird8};
        Technique[] techniques3 = {tank1, tank2, tank3, helicopter1, helicopter2, helicopter3, helicopter4, helicopter5};

        Uson uson = new Uson(1180433, 23, "Uson", animals3, techniques3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adamdyn atyn jazynyz: ");
        String names = scanner.nextLine();
        if (names.equals("Asan")) {
            System.out.println("-----------------------------------About ASAN----------------------------------");
            System.out.println(asan);
        } else if (names.equals("Uson")) {
            System.out.println("-----------------------------------About USON----------------------------------");
            System.out.println(uson);
        } else if (names.equals("Adyl")) {
            System.out.println("-----------------------------------About USON----------------------------------");
            System.out.println(adyl);
        } else System.out.println("Takogo cheloveka netu!");
    }

    public static void method2() {
        Cat cat99 = new Cat(99, 3, "Myao", 5.4, true);
        Dog dog99 = new Dog(100, 8, "Tuz", 9.3, true);
        Eagle eagle99 = new Eagle(101, 4, "Burkut", 12.3, false);
        WhiteSwan whiteSwan99 = new WhiteSwan(102, 7, "Lebed", 8.5, false);
        Bird bird99 = new Bird(103, 3, "Chymchyk", 2.11, false);
        Airplane airplane99 = new Airplane(105, 2020, "Samolet", "Model2020");
        Bayraktar bayraktar99 = new Bayraktar(107, 2019, "Ucak", "Model2019");
        Tank tank = new Tank(108, 2021, "Tanka", "Model2222");
        Sidan sidan = new Sidan(109, 2020, "Sidan", "Model2321");
        Helicopter helicopter99 = new Helicopter(110, 2020, "Vertolet", "Model213");

        Animal[] flyAnimals = {whiteSwan99, bird99, eagle99};
        Technique[] flyTechniques = {helicopter99, bayraktar99, airplane99};
        Animal[] unflyAnimals = {cat99, dog99};
        Technique[] unflyTechniques = {sidan, tank};

        Animal[] obwiyAnimals = {whiteSwan99, bird99, eagle99, cat99, dog99};
        Technique[] obwiyTechnique = {helicopter99, bayraktar99, airplane99, sidan, tank};

        Cat[] cats = new Cat[1];
        Dog[] dogs = new Dog[1];
        WhiteSwan[] whiteSwans = new WhiteSwan[1];
        Bird[] birds = new Bird[1];
        Eagle[] eagles = new Eagle[1];
        for (Animal i : obwiyAnimals) {
            if (i instanceof Cat) {
                cats[0] = (Cat) i;
            } else if (i instanceof Eagle) {
                eagles[0] = (Eagle) i;
            } else if (i instanceof WhiteSwan) {
                whiteSwans[0] = (WhiteSwan) i;
            } else if (i instanceof Bird) {
                birds[0] = (Bird) i;
            } else if (i instanceof Dog) {
                dogs[0] = (Dog) i;
            }
        }

        System.out.println("---------------------FLY ANIMALS-------------------");
        for (Animal i : flyAnimals) {
            System.out.println(i);
        }
    }
    public static void method3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vyberite nomer metoda kotorogo hotite zapustit: ");
        int number = scanner.nextInt();
        switch (number){
            case 1 -> method1();
            case 2 -> method2();
            default -> System.out.println("Mynday meyod jok");
        }
    }
}