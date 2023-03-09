package kassenbon;

public class Einkaufswagen {
    private double anzahl;
    private double price;
    private Lebensmittel essen;

    public Einkaufswagen(double _anzahl, Lebensmittel _essen){
        this.anzahl = _anzahl;
        this.price = Math.round((_anzahl * _essen.getPrice()) * 100.0) / 100.0;
        this.essen = _essen;
    }

    // Getter-Methoden
    public double getAnzahl() {
        return anzahl;
    }

    public double getPrice() {
        return price;
    }

    public Lebensmittel getEssen() {
        return essen;
    }
}
