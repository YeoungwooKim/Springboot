package board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@EntityScan(basePackageClasses = { Jsr310JpaConverters.class }, basePackages = { "board" })
@SpringBootApplication(exclude = { MultipartAutoConfiguration.class })
public class BoardApplication {

	public static void main(String[] args) {
		
		LogMaker log = new LogMaker();
		StackTraceElement[] stack = Thread.currentThread().getStackTrace();
		StackTraceElement main = stack[stack.length - 1];
		String mainClass = main.getClassName();
		log.getLog().debug(mainClass);

		SpringApplication.run(BoardApplication.class, args);
	}

}




