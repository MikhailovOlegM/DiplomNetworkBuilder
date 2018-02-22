package mikhailov.diplom.ae.NetworkBuilderApp;


import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetworkBuilderAppApplication {

    private static final Logger logger = Logger
            .getLogger(NetworkBuilderAppApplication.class.getName());

    public static void main(String[] args) {
        logger.info("Start app");
        SpringApplication.run(NetworkBuilderAppApplication.class, args);
    }

}
