package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        /** This is how we do normally(i.e hard coding but in spring we don`t do like this)
        Student obj = new Student();
        obj.setName("karthik");
        obj.displayName();
         **/

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student obj = context.getBean("student", Student.class);
        obj.displayName();

    }
}