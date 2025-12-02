package entity;

import jakarta.persistence.*;
import util.ConverterUtil;
import util.HashPasswordUtil;

@Entity
@Table(name = "students001")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String sname;
    @Convert(converter = ConverterUtil.class)
    private String email;
    private String password;

    @PrePersist
    @PreUpdate
    public void hashpswd(){
        if(password!=null && !(password.startsWith("$2a$"))){
            password = HashPasswordUtil.hashPassword(password);
        }
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
