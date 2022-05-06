package ru.stepik;

import java.util.Objects;

public class Author {
    private String firstNameOfAuthor;
    private String lastNameOfAuthor;

    public Author(String firstNameOfAuthor, String lastNameOfAuthor) {
        this.firstNameOfAuthor = firstNameOfAuthor;
        this.lastNameOfAuthor = lastNameOfAuthor;
    }

    public String getFirstNameOfAuthor() {

        return this.firstNameOfAuthor;
    }

    public String getLastNameOfAuthor() {

        return this.lastNameOfAuthor;
    }

    @Override
    public String toString() {
        return "Имя автора: " + firstNameOfAuthor + " | " + "Фамилия автора: " + lastNameOfAuthor;
    }

    @Override
    public boolean equals(Object others) {
        if (others == this) {
            return true;
        }
        if (this.getClass() != others.getClass()) { // Почему здесь мы указываем getClass
            return false;
        }
        Author a = (Author) others; // Какая логика создания нового объяекта
        return firstNameOfAuthor.equals(a.firstNameOfAuthor) && lastNameOfAuthor.equals(a.lastNameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameOfAuthor, lastNameOfAuthor);
    }
}
