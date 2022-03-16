import java.time.LocalDate;
import java.util.List;


public class Generate {

    public static List<Invoice> generateListInvoices() {
        return List.of(
                new Invoice(
                        "TV",678,
                        4,
                        LocalDate.of(2021,8,31),
                        "FXBFK"
                ),
                new Invoice(
                        "Wifi",
                        6,
                        3,
                        LocalDate.of(2020,7,13),
                        "GFHJK"
                ),
                new Invoice(
                        "hi",
                        208,
                        2,
                        LocalDate.of(2022,2,12),
                        "AJDJK"
                )
        );
    }
    
}
