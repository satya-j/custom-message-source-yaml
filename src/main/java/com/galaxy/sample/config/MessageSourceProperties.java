package com.galaxy.sample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "app")
public class MessageSourceProperties {

    private Map<String, Map<String, List<String>>> guidelines = new HashMap<>();

    public Map<String, Map<String, List<String>>> getGuidelines() {
        return guidelines;
    }

    public void setGuidelines(Map<String, Map<String, List<String>>> guidelines) {
        this.guidelines = guidelines;
    }
}
