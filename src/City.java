import java.util.Comparator;

public class City {
    private int code;
    private String nameCity;

    public City(int code, String nameCity) {
        this.code = code;
        this.nameCity = nameCity;
    }

    public int getCode() {
        return code;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", nameCity='" + nameCity + '\'' +
                '}';
    }
    public static Comparator<City> cityComparator = new Comparator<City>() {
        @Override
        public int compare(City o1, City o2) {
            return o2.code - o1.code;
        }
    };

}
