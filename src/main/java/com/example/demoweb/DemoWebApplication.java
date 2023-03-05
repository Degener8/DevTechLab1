package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.net.InetAddress;
import java.net.UnknownHostException;

@EnableJpaRepositories("com.example.demoweb.*")
@ComponentScan(basePackages = { "com.example.demoweb.*" })
@EntityScan("com.example.demoweb.*")
@SpringBootApplication
public class DemoWebApplication {

	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext context = SpringApplication.run(DemoWebApplication.class, args);

		String port = context.getEnvironment().getProperty("server.port");

		InetAddress ip = InetAddress.getLocalHost();
		String hostname = ip.getHostName();

		System.out.println("http://localhost:" + port + "/");
	}

}
