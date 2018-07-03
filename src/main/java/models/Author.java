package models;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author{

    private int id;
    private String first_name;
    private String last_name;
    private int age;

    public Author() {

    }

    public Author(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "first_name")
    public String getFirst_name() {
        return first_name;
    }

    @Column(name = "last_name")
    public String getLast_name() {
        return last_name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
