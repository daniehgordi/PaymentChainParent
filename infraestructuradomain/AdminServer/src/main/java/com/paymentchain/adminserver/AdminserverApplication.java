package com.paymentchain.adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.cache.caffeine.CaffeineCacheManager;


@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminServer
@EnableEurekaClient
public class AdminserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminserverApplication.class, args);
	}

    @Bean
    SecurityFilterChain securityPermitAllConfigSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().anyRequest().permitAll()
                .and().csrf().disable();
        return http.build();
    }
    
    @Bean
    public CaffeineCacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        // Puedes personalizar la configuración de Caffeine aquí si es necesario
        return cacheManager;
    }
            

}
