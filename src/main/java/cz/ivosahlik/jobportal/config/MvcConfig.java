package cz.ivosahlik.jobportal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;

import static java.nio.file.Paths.get;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    private static final String UPLOAD_DIR = "photos";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        exposeDirectory(registry);
    }

    private void exposeDirectory(ResourceHandlerRegistry registry) {
        Path path = get(MvcConfig.UPLOAD_DIR);
        registry.addResourceHandler("/" + MvcConfig.UPLOAD_DIR + "/**").addResourceLocations("file:" + path.toAbsolutePath() + "/");
    }
}
