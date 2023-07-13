package Reader;

public class Book {
    private Author author;
    private String title;
    private int pageCount;
    private String type;
    private boolean hardCover;
    private int currentPage;

    public Book(Author author, String title, int pageCount, String type, boolean hardCover) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.type = type;
        this.hardCover = hardCover;
        this.currentPage = 0;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getType() {
        return type;
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
