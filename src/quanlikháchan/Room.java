package quanlikháchan;

public class Room {
    private String category;
    private double prices;

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return " Room: " + category + " prices: " + prices;
    }
}
