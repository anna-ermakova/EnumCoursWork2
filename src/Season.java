public enum Season {

    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень"),
    WINTER("Зима");

    private String translation;

    Season(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}

