package planet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import planet.annonbeans.ITestInterface;
import planet.annonbeans.SeconTest;
import planet.dao.FinReportDaoImpl;
import planet.dao.IFinReport;
import planet.entity.FinReport;
import planet.xmlbeans.HelloWorld;

/**
 * Created by randriyanov on 03.09.15.
 */
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("beans.xml");
//
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.setMessage("Hello");
//        System.out.println(obj.getMessage());

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(MainConfig.class);
        ctx.refresh();
        SeconTest myBean = ctx.getBean(SeconTest.class);
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorldTwo");
        //helloWorld.setMessage("hello");
        System.out.println(helloWorld.getMessage());
        myBean.doSomething();
    }
}
