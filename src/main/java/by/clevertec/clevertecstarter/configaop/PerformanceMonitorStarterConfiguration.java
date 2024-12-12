package by.clevertec.clevertecstarter.configaop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PerformanceMonitorAutoConfiguration.class)
public class PerformanceMonitorStarterConfiguration {}