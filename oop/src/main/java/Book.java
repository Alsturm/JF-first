package intro;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j2;

@Accessors(chain = true)
@Data
@Log4j2
public class Book {

    private String title;
    private String color;

    public static void main(String[] args) {
        log.error("объект - {} (только что создан!)", new Book()
                .setTitle("book")
                .setColor("Red").toString());

        log.error("{}jshgadf", () -> 5);
    }
}

