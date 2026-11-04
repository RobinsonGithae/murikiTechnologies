package com.murikitechnologies.userAccountsAndAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserAccountsAndAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAccountsAndAuthenticationApplication.class, args);
	}

}
