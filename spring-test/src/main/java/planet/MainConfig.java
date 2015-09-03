package planet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import planet.annonbeans.ITestInterface;
import planet.annonbeans.SecondInterfaceImpl;
import planet.annonbeans.TestIntefaceImpl;

@Configuration
@ComponentScan
@ImportResource("classpath:beans.xml")
public class MainConfig {


    @Bean(name = "firstTest")
    public ITestInterface getITestInterface() {
        return new TestIntefaceImpl();
    }

    @Bean(name = "secondTest")
    public ITestInterface getTestInterface() {
        return new SecondInterfaceImpl();
    }

}
