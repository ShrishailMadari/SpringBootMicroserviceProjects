package com.shyloostyle.ratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingsAndReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsAndReviewApplication.class, args);
	}

}
