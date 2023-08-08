package org.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        /** Here we are changing source code it should not be changed
        Airtel airtel = new Airtel();
        airtel.Calling();
        airtel.Data();

        Sim sim = new Jio();
        sim.Calling();
        sim.Data();
         **/


      /**   Here we are changing source code it should not be changed
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Airtel obj =(Airtel)context.getBean("airtel");
        obj.Calling();
        obj.Data();

        Jio obj1 = context.getBean("jio", Jio.class);
        obj1.Calling();
        obj1.Data();

       **/

       //it is configurable now,we not need to change source code, it is done by spring IOC
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            Sim s=context.getBean("sim",Sim.class); // it will give me a reference of Sim interface
            s.Calling();
            s.Data();




    }
}