package in.aarogyarai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.modelmapper.ModelMapper;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "AarogyaRai API", version = "1.0"))
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
//	@Bean
//	public ModelMapper modelMapper()
//	{
//		return new ModelMapper();
//	}
}
