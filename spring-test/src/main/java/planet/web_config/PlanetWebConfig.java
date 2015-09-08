package planet.web_config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import planet.WebConfig;


public class PlanetWebConfig extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }
}
