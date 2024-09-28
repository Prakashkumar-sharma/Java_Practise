package Collection.Map;

public class Population {
    private String cityName;
    private long population;

    public Population(String cityName , long population){
        this.cityName = cityName;
        this.population = population;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public boolean equals(Object population) {
        Population population1 = (Population) population;
        if (this.cityName.startsWith(String.valueOf(population1.getCityName().charAt(0))) && this.population > 100000 && this.population < 500000 && population1.population > 100000 && population1.population < 500000) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Population city1 = new Population("Delhi" , 450000);
        Population city2 = new Population("Dehradun" , 350000);
        Population city3 = new Population("Chennai" , 400000);
        Population city4 = new Population("Chandigarh" , 50000);
        System.out.println(city1.equals(city2));
        System.out.println(city3.equals(city4));


    }
    }

