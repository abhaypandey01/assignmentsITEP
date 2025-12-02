package entity;

import jakarta.persistence.*;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="librarian")
public class Librarian {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(unique=true)
    private String username;
    @Column(length=100)
    private String password;

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", books=" + books +
                ", students=" + students +
                '}';
    }

    @Column(length=100, unique=true)
    private String email;
    @OneToMany(mappedBy = "librarian", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<Book>();
    @OneToMany(mappedBy = "librarian", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Librarian() {}

    @PreUpdate
    @PrePersist
    public void hashPasswordEntry(){
        if(password != null && !(password.startsWith("$2a$"))) {
            password = BCrypt.hashpw(password, BCrypt.gensalt());
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
