package bbubbu.me.dddhexpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"bbubbu.me.dddhexpackage"})
public class DddHexPackageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddHexPackageApplication.class, args);
	}

}
