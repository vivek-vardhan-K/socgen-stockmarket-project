package socgen.iiht.boardmembersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class BoardMembersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardMembersServiceApplication.class, args);
	}

}
