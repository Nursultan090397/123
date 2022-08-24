public abstract class Technique {
    int id,year;
    String name,model;

    public Technique(int id, int year, String name, String model) {
        this.id = id;
        if (year>=2018) {
            this.year = year;
        }
        else System.out.println("Technique eski janysyn alyp keliniz!");
        this.name = name.toUpperCase();
        this.model = model;
    }
    public abstract void oils();
    public abstract void capacity();

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Technique{" +
                "id=" + id +
                " year=" + year +
                " name='" + name + '\'' +
                " model='" + model + '\'' +
                '}' + '\n';
    }
}
