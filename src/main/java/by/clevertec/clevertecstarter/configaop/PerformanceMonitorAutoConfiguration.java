package by.clevertec.clevertecstarter.configaop;


import by.clevertec.clevertecstarter.aspect.DefaultPropertiesLoggingAspect;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DefaultPropertiesLoggingAspect.class)
public class PerformanceMonitorAutoConfiguration {
}
