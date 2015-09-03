package planet.annonbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SeconTest {

    @Autowired
    @Qualifier("firstTest")
    private ITestInterface testInterface;

    @Resource(name = "secondTest")
    private ITestInterface secondInTestInterface;

    public void doSomething() {
        testInterface.printSomething();
        secondInTestInterface.printSomething();
    }


}
