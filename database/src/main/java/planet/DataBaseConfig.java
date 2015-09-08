package planet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import planet.dao.FinReportDaoImpl;
import planet.dao.IFinReport;

@Configuration
public class DataBaseConfig {

    @Bean
    public IFinReport finReport() {
        return new FinReportDaoImpl();
    }
}
