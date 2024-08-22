package org.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.Embedded.FullName;

@Entity

public class Student {
    @Id
    private int id;

    private FullName fullname;

    private String address;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getFullname() {
        return fullname;
    }

    public void setFullname(FullName fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
    }
}

