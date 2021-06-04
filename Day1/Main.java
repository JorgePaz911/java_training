package Day1;

class Book{
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display(){
        System.out.println(title + " " + author + " " + price);
    }
}


public class Main {

    public static void main(String[] args){
        Book book = new Book("Title1", "Author1", 20);
        book.display();
    }
}
