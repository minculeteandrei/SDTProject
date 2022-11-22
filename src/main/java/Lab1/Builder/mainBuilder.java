package Lab1.Builder;

public class mainBuilder {
    public static void main(String[] args) {
        Car fordTrend=new Car.Builder("Ford",2009,87,"diesel","XYZ").build();
        Car fordTitanium=new Car.Builder("Ford",2018,125,"diesel","WWW").sound(Sound.MP3).navigation(Navigation.SMALL).build();
        Car fordEco = new Car.Builder("Ford",2019,100,"gas","YHD").air(Air.AUTO).build();

        System.out.println(fordTrend.toString());
        System.out.println(fordTitanium.toString());
        System.out.println(fordEco.toString());

    }
}
