public class Main {


    public static void main(String[] args) {

        Season season = Season.SPRING;

        switch (season) {
            case AUTUMN:
                System.out.println(season.getTranslation() + ": Доставай сапоги и зонтик");
                break;
            case WINTER:
                System.out.println(season.getTranslation() + ": Доставай санки и варежки");
                break;
            case SPRING:
                System.out.println(season.getTranslation() + ": Доставай туфли и кардиган");
                break;
            case SUMMER:
                System.out.println(season.getTranslation() + ": Доставай сандали и сарафан");
                break;
        }

    }
}