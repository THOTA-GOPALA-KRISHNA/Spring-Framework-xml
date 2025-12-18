package org.javabased;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public Laptop()
    {
        System.out.println("Laptop is object is created");
    }


    @Override
    public void code() {
        System.out.println("Laptop is compiling");
    }
}
