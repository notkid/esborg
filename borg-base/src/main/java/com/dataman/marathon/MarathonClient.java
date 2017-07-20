package com.dataman.marathon;


import com.dataman.util.ModelUtil;
import com.dataman.util.ResponseException;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Response;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

import static java.util.Arrays.asList;

public class MarathonClient {

	static class MarathonHeadersInterceptor implements RequestInterceptor {

		@Override
		public void apply(RequestTemplate template) {
			template.header("Accept", "application/json");
			template.header("Content-Type", "application/json");
		}
	}

	static class MarathonErrorDecoder implements ErrorDecoder {

		@Override
		public Exception decode(String methodKey, Response response) {
			return new ResponseException(response.status(), response.reason());
		}
	}

	public static Marathon getInstance(String endpoint) {

		GsonDecoder decoder = new GsonDecoder(ModelUtil.GSON);
		GsonEncoder encoder = new GsonEncoder(ModelUtil.GSON);
		return Feign.builder().encoder(encoder).decoder(decoder).errorDecoder(new MarathonErrorDecoder())
				.requestInterceptor(new MarathonHeadersInterceptor()).target(Marathon.class, endpoint);
	}

	public static Marathon getInstance(String endpoint, RequestInterceptor... interceptors) {

		Feign.Builder b = Feign.builder().encoder(new GsonEncoder(ModelUtil.GSON))
				.decoder(new GsonDecoder(ModelUtil.GSON)).errorDecoder(new MarathonClient.MarathonErrorDecoder());
		if (interceptors != null)
			b.requestInterceptors(asList(interceptors));
		b.requestInterceptor(new MarathonClient.MarathonHeadersInterceptor());
		return b.target(Marathon.class, endpoint);
	}

	public static Marathon getInstanceWithBasicAuth(String endpoint, String username, String password) {

		return getInstance(endpoint, new BasicAuthRequestInterceptor(username, password));
	}


}
