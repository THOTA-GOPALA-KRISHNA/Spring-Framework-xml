package org.javabased;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Autowired
    private Computer com;

    public Alien(int age, Computer com)
    {
        this.age = age;
        this.com = com;
    }

    public Alien()
    {}

    public void compile()
    {
        this.com.code();
    }



}
