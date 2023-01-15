package pro.sky.java.course1.homework12;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Александр", "Пушкин");

        Book book1 = new Book("Анна Каренина", author1, 1877);
        System.out.println("Название книги = " + book1.getBookName() + ", автор = " + book1.getAuthor() + ", год пупликации = " + book1.getPublishingYear());

        Book book2 = new Book("Каменный гость", author2, 1830);
        System.out.println("Название книги = " + book2.getBookName() + ", автор = " + book2.getAuthor() + ", год пупликации = " + book2.getPublishingYear());

        book1.setPublishingYear(1899);
        System.out.println("Название книги = " + book1.getBookName() + ", автор = " + book1.getAuthor() + ", год пупликации = " + book1.getPublishingYear());

    }
}
