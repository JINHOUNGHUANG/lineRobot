package line.robot.message_object.http;

import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import java.util.Map;




public class OKHttpExecuter {
	private OkHttpClient client = new OkHttpClient();
	private final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
	public void sendPostByJson(String url, String replyToken, String json,Callback callback) {
		Request request = new Request.Builder()
				.url(url)
				.header("Authorization", "Bearer {" + replyToken + "}")
				.post(RequestBody.create(JSON, json))
				.build();
		client.newCall(request).enqueue(callback);
	}
	
	public void sendPostByJson(String url, Map<String, String> header, String json,Callback callback) {
		Request request = new Request.Builder()
				.url(url)
				.headers(Headers.of(header))
				.post(RequestBody.create(JSON, json))
				.build();
		client.newCall(request).enqueue(callback);
	}
}
