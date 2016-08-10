package UA;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SC on 08.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/applicationContext.xml");
        Bard bard1 = context.getBean("bard1",Bard.class);
        Bard bard2 = context.getBean("bard2",Bard.class);
        bard1.sing();
        bard2.sing();

        Ballada heroBalada = context.getBean("balladaHero", Ballada.class);
        Ballada simpleBalada = context.getBean("balladaSimple", Ballada.class);


        context.close();
    }
}
