package line.robot.message_object;

public class TextMessage extends BaseMessage{
	private String text;
	private boolean wrap;
	
	public TextMessage(String text) {
		super("text");
		this.text = text;
		this.wrap = true;
	}
	
	
	public boolean isWrap() {
		return wrap;
	}


	public void setWrap(boolean wrap) {
		this.wrap = wrap;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}


	@Override
	public String toString() {
		return "{\"text\":\"" + text + "\", \"wrap\":" + wrap + ",\"type\":\"text\"}";
	}

	
}
