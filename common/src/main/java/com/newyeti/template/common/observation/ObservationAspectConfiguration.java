package com.newyeti.template.common.observation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.observation.ObservationRegistry;
import io.micrometer.observation.aop.ObservedAspect;

@Configuration
public class ObservationAspectConfiguration {
    @Bean
    public ObservationRegistry observationRegistry() {
      return ObservationRegistry.create();
    }

    @Bean
    public ObservedAspect observedAspect(ObservationRegistry observationRegistry) {
      observationRegistry.observationConfig().observationHandler(new SimpleLoggingHandler());
      return new ObservedAspect(observationRegistry);
    }
}
