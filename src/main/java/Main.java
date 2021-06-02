import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book(1, "Harry Potter", 1995);
        Book book2 = new Book(2, "Harry Potter 2", 1996);
        Book book3 = new Book(3, "Harry Potter 3", 1997);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        String result = new ObjectMapper().writeValueAsString(books);
        File file = new File("result.json");
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter sw = new FileWriter("result.json");
        sw.write(result);
        sw.flush();
        sw.close();
    }
}