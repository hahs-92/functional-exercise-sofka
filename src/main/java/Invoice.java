import java.time.LocalDate;

public class Invoice {
    private String description;
    private int price;
    private int cuantity;
    private LocalDate date;
    private String code;

    public Invoice(String description, int price, int cuantity, LocalDate date, String code) {
        this.description = description;
        this.price = price;
        this.cuantity = cuantity;
        this.date = date;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCuantity() {
        return cuantity;
    }

    public void setCuantity(int cuantity) {
        this.cuantity = cuantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", count=" + cuantity +
                ", date=" + date +
                ", code='" + code + '\'' +
                '}';
    }
}
