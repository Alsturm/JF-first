package intro;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class Book {

    private String title;
    private String color;

    public static void main(String[] args) {
        System.out.println(new Book()
                .setTitle("book")
                .setColor("Red"));
    }
}

