package line.robot.message_object;

public class AudioMessage extends BaseMessage{
	private String originalContentUrl;
	private String previewImageUrl;
	private int duration;
	public AudioMessage(String originalContentUrl, String previewImageUrl, int duration) {
		super("audio");
		this.originalContentUrl = originalContentUrl;
		this.previewImageUrl = previewImageUrl;
		this.duration = duration;
	}
	public String getOriginalContentUrl() {
		return originalContentUrl;
	}
	public void setOriginalContentUrl(String originalContentUrl) {
		this.originalContentUrl = originalContentUrl;
	}
	public String getPreviewImageUrl() {
		return previewImageUrl;
	}
	public void setPreviewImageUrl(String previewImageUrl) {
		this.previewImageUrl = previewImageUrl;
	}
	@Override
	public String toString() {
		return "{\"originalContentUrl\":\"" + originalContentUrl + "\", \"previewImageUrl\":\"" + previewImageUrl
				+ "\", \"duration\":\"" + duration + "\", \"type\":\"audio\"}";
	}
	
}
