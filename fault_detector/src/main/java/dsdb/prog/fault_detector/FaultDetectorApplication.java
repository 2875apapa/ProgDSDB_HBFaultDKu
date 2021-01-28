package dsdb.prog.fault_detector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FaultDetectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaultDetectorApplication.class, args);
    }

}
