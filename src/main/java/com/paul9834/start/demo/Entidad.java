package com.paul9834.start.demo;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "edad")
    private int age;

    @Column(name = "email")
    private String email;


    public Entidad ()  {
    }

    public Entidad(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
