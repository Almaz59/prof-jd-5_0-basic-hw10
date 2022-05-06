package ru.stepik;

import java.util.Objects;

public class Book {
    private String nameOfBook;
    private Author nameOfAuthor;
    int yearOfPublication;

    public Book(String nameOfBook, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameOfBook() {

        return this.nameOfBook;
    }

    public Author getNameOfAuthor() {

        return this.nameOfAuthor;
    }


    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название книги: " + this.nameOfBook + " | " + "Год публикации: " + this.yearOfPublication;
    }

    @Override // Что это значит
    public boolean equals(Object others) {
        if (others == this) {
            return true;
        }
        if (this.getClass() != others.getClass()) { // Почему здесь мы указываем getClass
            return false;
        }
        Book b = (Book) others; // Какая логика создания нового объяекта
        return nameOfBook.equals(b.nameOfBook) && yearOfPublication == b.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, yearOfPublication);
    }
}

