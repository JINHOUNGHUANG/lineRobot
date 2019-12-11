package line.robot.message_object;

import line.robot.message_object.api.PushMessage;

public class Main {
	public static void main(String[] args) {
		PushMessage pushMessage = new PushMessage("ti12311231fq1123", new BaseMessage[] {
				new TextMessage("文字測試"),
		});
		System.out.println(pushMessage);
	}
}
