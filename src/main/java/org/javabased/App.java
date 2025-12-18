package org.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

//        Desktop d = context.getBean("desktop",Desktop.class);
//        d.code();

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.compile();

    }

}
