package ru.stepik;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java 8. Полное руководство", 2015);
        Author author = new Author("Герберт", "Шилдт");
        Book book1 = new Book("Старик и море", 1952);
        Author author1 = new Author("Эрнест", "Хемингуэй");
        System.out.println(book);
        System.out.println(author);
        System.out.println(book.equals(book1));
        System.out.println(author.equals(author1));
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(author.hashCode());
        System.out.println(author1.hashCode());
    }

}
