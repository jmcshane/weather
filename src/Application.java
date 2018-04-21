import CurrentWeather.WeatherCat;
import WeatherStation.FindWeatherStation;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
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
    @Bean
    public FindWeatherStation findWeatherStation() {
        return new FindWeatherStation();
    }
}
