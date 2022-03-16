import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Invoice factura = new Invoice(
                "TV",678,
                4,
                LocalDate.of(2021,8,31),
                "FXBFK"
        );
        Invoice factura2 = new Invoice(
                "Wifi",
                6,
                3,
                LocalDate.of(2020,7,13),
                "GFHJK"
        );
        Invoice factura3 = new Invoice(
                "hi",
                208,
                2,
                LocalDate.of(2022,2,12),
                "AJDJK"
                );

        List<Invoice> invoiceList = List.of(
                factura,
                factura2,
                factura3
        );

        //filtros

        //obtener facturas con el precio menor de 100
        List<Invoice> invoicesPriceLessThan100 =  invoiceList.stream()
                .filter(f -> f.getPrice() < 100)
                .collect(Collectors.toList());

        //obtener facturas con la cantidad mayor de 2
        List<Invoice> invoicesCuantityGreatherThan2 = invoiceList.stream()
                .filter(i -> i.getCuantity() > 2)
                .collect(Collectors.toList());

        //obtener factura con el codigo FXBFK
        Optional<Invoice> invoiceWithCodeFXBFK = invoiceList.stream()
                .filter(i -> Objects.equals(i.getCode(), "FXBFK"))
                .findFirst();

        //Obtener fucturas con la fecha despues del 2021/01/01
        List<Invoice> invoicesDateAfter2021 = invoiceList.stream()
                .filter(i -> i.getDate().isAfter(LocalDate.of(2021,1,1)))
                .collect(Collectors.toList());


        System.out.println("invoicesPriceLessThan100: " + invoicesPriceLessThan100);
        System.out.println("invoicesCuantityGreatherThan2. " + invoicesCuantityGreatherThan2);
        System.out.println("invoiceWithCodeFXBFK: " + invoiceWithCodeFXBFK.get());
        System.out.println("invoiceDateAfter2021: " + invoicesDateAfter2021);

    }
}
