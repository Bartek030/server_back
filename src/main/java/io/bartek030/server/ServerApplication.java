package io.bartek030.server;

import io.bartek030.server.model.Server;
import io.bartek030.server.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static io.bartek030.server.enumeration.Status.*;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	// to notify for Spring
	@Bean
	CommandLineRunner run(ServerRepository serverRepository) {
		return args -> {
			// code runs after app initialize
			serverRepository.save(new Server(null,
					"192.168.1.160",
					"Ubuntu Linux",
					"16 GB",
					"Personal PC",
					"http://localhost:8080/server/image/server1.png",
					SERVER_UP));
			serverRepository.save(new Server(null,
					"192.168.1.58",
					"Fedora Linux",
					"16 GB",
					"Dell Tower",
					"http://localhost:8080/server/image/server2.png",
					SERVER_DOWN));
			serverRepository.save(new Server(null,
					"192.168.1.21",
					"MS 2008",
					"21 GB",
					"Web Server",
					"http://localhost:8080/server/image/server3.png",
					SERVER_UP));
			serverRepository.save(new Server(null,
					"192.168.1.14",
					"Red Hat Enterprise Linux",
					"64 GB",
					"Mail Server",
					"http://localhost:8080/server/image/server4.png",
					SERVER_DOWN));
		};
	}
}
