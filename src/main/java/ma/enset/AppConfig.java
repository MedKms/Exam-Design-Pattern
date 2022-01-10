package ma.enset;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"ma.enset.diagramme","ma.enset.aspects","ma.enset.pattern"})
public class AppConfig {
}
