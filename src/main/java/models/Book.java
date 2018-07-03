package models;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    private int id;
    private String title;
    private int yearOfPub;
    private String author;

    public Book(){

    }

    public Book(String title, int yearOfPub, String author) {
        this.title = title;
        this.yearOfPub = yearOfPub;
        this.author = author;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "yearOfPub")
    public int getYearOfPub() {
        return yearOfPub;
    }

    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
