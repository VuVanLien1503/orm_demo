package com.example.orm_demo.model;

import javax.persistence.*;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String address;
    private String image;
    @ManyToOne
    private Classroom classroom;

    public Student() {
    }

    public Student(Long id, String name, int age, String address, String image, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.image = image;
        this.classroom = classroom;
    }

    public Student(String name, int age, String address, String image, Classroom classroom) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.image = image;
        this.classroom = classroom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
