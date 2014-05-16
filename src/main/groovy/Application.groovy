import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableAutoConfiguration
@ComponentScan
class Application {
    static main(args) {
        SpringApplication.run(Application.class, args)
    }
}
