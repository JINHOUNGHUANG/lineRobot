package line.robot.message_object.http;

import java.io.IOException;

import line.robot.message_object.api.MulticastMessage;
import line.robot.message_object.api.PushMessage;
import line.robot.message_object.api.ReplyMessage;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class LineConnector {

	private final String LINE_PUSH_API = "https://api.line.me/v2/bot/message/push";
	private final String LINE_REPLY_API = "https://api.line.me/v2/bot/message/reply";
	private final String LINE_MULTICAST_API = "https://api.line.me/v2/bot/message/multicast";

	private static LineConnector instance;
	private OKHttpExecuter executer;

	private LineConnector() {
		executer = new OKHttpExecuter();
	}

	public static LineConnector getInstance() {
		if (instance == null) {
			synchronized (LineConnector.class) {
				if (instance == null) {
					instance = new LineConnector();
				}
			}
		}
		return instance;
	}

	public void replyMessage(String LINE_TOKEN, ReplyMessage replyMessage) {
		;
		executer.sendPostByJson(LINE_REPLY_API, LINE_TOKEN, replyMessage.toString(), new Callback() {
			public void onResponse(Call call, Response response) throws IOException {
				System.out.println("發送成功");
				System.out.println(response.body().string());
			}

			public void onFailure(Call call, IOException e) {
				System.err.println("發送失敗");
				e.printStackTrace();
			}
		});
	}

	public void pushMessage(String LINE_TOKEN, PushMessage pushMessage) {
		executer.sendPostByJson(LINE_PUSH_API, LINE_TOKEN, pushMessage.toString(), new Callback() {
			public void onResponse(Call call, Response response) throws IOException {
				System.out.println("發送成功");
				System.out.println(response.body().string());
			}

			public void onFailure(Call call, IOException e) {
				System.err.println("發送失敗");
				e.printStackTrace();
			}
		});
	}
	
	public void multicastMessage(String LINE_TOKEN, MulticastMessage multicastMessage) {
		executer.sendPostByJson(LINE_MULTICAST_API, LINE_TOKEN, multicastMessage.toString(), new Callback() {
			public void onResponse(Call call, Response response) throws IOException {
				System.out.println("發送成功");
				System.out.println(response.body().string());
			}

			public void onFailure(Call call, IOException e) {
				System.err.println("發送失敗");
				e.printStackTrace();
			}
		});
	}
}
