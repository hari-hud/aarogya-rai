package in.aarogyarai.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// REF: https://modelmapper.org/getting-started/

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
