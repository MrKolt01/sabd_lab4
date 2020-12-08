package kolt.zar.sabd_lab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SabdLab4Application {

	public static void main(String[] args) {
		SpringApplication.run(SabdLab4Application.class, args);
	}

}
