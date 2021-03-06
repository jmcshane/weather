import CurrentWeather.WeatherCat;
import WeatherStation.FindWeatherStation;
import WeatherStation.WeatherApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackageClasses = WeatherApplicationRunner.class)
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(false)
                .headless(true)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
