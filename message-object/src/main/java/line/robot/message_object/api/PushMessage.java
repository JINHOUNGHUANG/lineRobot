package line.robot.message_object.api;

import java.util.Arrays;

import line.robot.message_object.BaseMessage;


public class PushMessage extends BaseApiMessage{
	private String to;
	private BaseMessage[] messages;
	
	public PushMessage(String to, BaseMessage[] messages) {
		this.to = to;
		this.messages = messages;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BaseMessage[] getMessages() {
		return messages;
	}

	public void setMessages(BaseMessage[] messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "{\"to\":\""+to+"\", \"messages\":"+Arrays.toString(messages)+"}";
	}
	
}
