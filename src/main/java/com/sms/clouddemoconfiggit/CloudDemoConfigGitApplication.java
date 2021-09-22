package com.sms.clouddemoconfiggit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudDemoConfigGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoConfigGitApplication.class, args);
	}

}
