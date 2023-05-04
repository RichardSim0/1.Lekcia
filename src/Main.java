import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // premenná - variable

        // dátový typ - data type

        String item; // názov zboží - datový typ: String, názov premennej: item

        item = "Rohlík"; // do premennej "item" ulož text "Rohlík"

        // Použitie premennej:
        System.out.println(item); // Použijem hodnotu premennej a vypíšem ju na obrazovku

        int quantity; // celé číslo (aj záporné) - int
        double weight = 0.043; // desatinné čísla... oddelovač je desatinná bodka
        weight = 0.33333333;

        double price = 0.1;
        for (int i = 1; i <= 10; i++) {
            price = price + 0.1;
        }
        System.out.println(price);

        BigDecimal totalPrice = BigDecimal.valueOf(0.1); // camelCase... Hrb ťavy
        boolean hasDiscount;
        for (int i = 1; i <= 10; i++) {
            totalPrice = totalPrice.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(totalPrice);
        // ... prvé slovo malé, ostatné začínajú veľkým

        LocalDate issued = LocalDate.of(2023, 5, 3);
        issued = LocalDate.now();

        boolean isDiscounted = true; //false... nemá zľavu, true... má zľavu
    }
}