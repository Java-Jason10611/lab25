import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {

	private RestTemplate rt;

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Arobot");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<Weather> getWeather(String latitude,String longitude) {

		String url = "https://forecast.weather.gov/MapClick.php?lat={latitude}&lon={longitude}&FcstType=json";

		WeatherResponse response = rt.getForObject(url, WeatherResponse.class, latitude, longitude);

		return response.getForcast();

	}


}


