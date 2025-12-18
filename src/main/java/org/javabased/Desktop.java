package org.javabased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    public Desktop()
    {
        System.out.println("Desktop object is created");
    }


    public void code()
    {
        System.out.println("Desktop is compiling");
    }
}
