public class City {
    public static String name;
    public static int population;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public City(String name, int population){
        this.name= name;
        this.population = population;
    }
    @Override
    public String toString() {
        return name + " "+ population;
    }
}
