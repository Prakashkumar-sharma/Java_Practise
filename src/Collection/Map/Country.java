package Collection.Map;

public class Country {
    private String countryName;
    private Integer countryCode;

    public Country(String countryName, Integer countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public boolean equals(Object country) {
        Country country1 = (Country) country;
        if (this.countryName.startsWith(String.valueOf(country1.getCountryName().charAt(0))) && this.countryCode > 0 && this.countryCode < 100 && country1.countryCode > 0 && country1.countryCode < 100) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Country country1 = new Country("India" , 91);
        Country country2 = new Country("Iran" , 98);
        Country country3 = new Country("Russia" , 7);
        Country country4 = new Country("China" , 86);
        Country country5 = new Country("Columbia" , 56);
        Country country6 = new Country("Ireland" , 353);

        System.out.println(country1.equals(country2));
        System.out.println(country1.equals(country4));
        System.out.println(country4.equals(country5));
        System.out.println(country1.equals(country6));

    }
    }

