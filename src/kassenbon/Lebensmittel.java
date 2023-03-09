package kassenbon;

public enum Lebensmittel {
    WURST(1,"Wurst", 2.49, "KG"),
    KÄSE(2,"Käse", 1.99, "KG"),
    BUTTER(3,"Butter", 2.99, "KG"),
    MILCH(4,"Milch", 1.79, "Liter"),
    TV(5, "Tv", 499, "Stück"),
    GURKE(6,"Gurke", 1.79, "Stück"),
    KAROTTE(7,"Karotte", 1.29, "KG"),
    SALAT(8,"Kopfsalat", 0.99, "Stück"),
    SMOOTHIE(9,"Smoothie", 4.79, "Liter");

    private final int nr;
    private final String beschreibung;
    private final double price;
    private final String einheit;

    Lebensmittel(int nr, String beschreibung, double price, String einheit){
        this.nr = nr;
        this.beschreibung = beschreibung;
        this.einheit = einheit;
        this.price = price;
    }

    public int getNr() {
        return nr;
    }

    public String getBeschreibung(){
        return beschreibung;
    }

    public double getPrice(){
        return price;
    }

    public String getEinheit() {
        return einheit;
    }

    public static Lebensmittel getEssenByNr(int nummer){
        for (Lebensmittel essen : Lebensmittel.values()) {
            if (essen.getNr() == nummer) {
                return essen;
            }
        }
        return null;
    }

}