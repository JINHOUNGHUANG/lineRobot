package line.robot.message_object.api;

import java.util.Arrays;

import line.robot.message_object.BaseMessage;


public class MulticastMessage extends BaseApiMessage{
	private String[] to;
	private BaseMessage[] messages;
	
	public MulticastMessage(String[] to, BaseMessage[] messages) {
		super();
		this.to = to;
		this.messages = messages;
	}
	public String[] getTo() {
		return to;
	}
	public void setTo(String[] to) {
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
		return "{\"to\":" + getToString() + ", \"messages\":" + Arrays.toString(messages) + "}";
	}
	private String getToString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for(String str : to) {
			builder.append("\"").append(str).append("\",");
		}
		builder.deleteCharAt(builder.length()-1);
		builder.append("]");
		return builder.toString();
	}
	
}
