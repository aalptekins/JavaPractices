package Reader;

public class ReaderTest {
    public static void main(String[] args) {
        // Author nesnesi oluşturma
        Author author1 = new Author("Sabahattin Ali");
        Author author2 = new Author("Recaizade Mahmut");

        // Book nesneleri oluşturma
        Book book1 = new Book(author1, "Sirca kosk", 200, "Tale", true);
        Book book2 = new Book(author2, "Araba sevdasi", 350, "Realistic Novel", false);

        // Reader nesneleri oluşturma
        Reader reader1 = new Reader("Asli", 25, "Female");
        Reader reader2 = new Reader("Ahmet", 30, "Male");

        // Kitap okuma simülasyonu
        reader1.read(book1); // Asli "Sirca kosk" kitabını okuyor
        reader2.read(book2); // Ahmet "Araba sevdasi" kitabını okuyor
        reader1.read(book1); // Asli "Sirca kosk" kitabının bir sonraki sayfasını okuyor
        reader1.read(book1); // Asli "Sirca kosk" kitabının bir sonraki sayfasını okuyor
    }
}
