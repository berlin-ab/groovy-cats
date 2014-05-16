import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@EnableAutoConfiguration
@Configuration
@ComponentScan
class Application {
    static main(args) {
        SpringApplication.run(Application.class, args)
    }
}
