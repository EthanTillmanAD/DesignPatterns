package patterns.creational.prototype.creatingOurOwn;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String s){
        Item item = null;

        try {
            item = (Item) (items.get(s)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRunTime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumOfPages(335);
        book.setTitle("Basic book");
        book.setPrice(19.99);
        items.put("Book", book);
    }
}
