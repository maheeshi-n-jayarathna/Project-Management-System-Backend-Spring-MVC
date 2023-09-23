package lk.ijse.assignment.config;

import lk.ijse.assignment.service.utill.TechLeadServiceImpl;
import lk.ijse.assignment.utill.EntityDtoConvertor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JPAConfig.class})
@ComponentScan(basePackageClasses = {TechLeadServiceImpl.class, EntityDtoConvertor.class})
public class WebRootConfig {
    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
