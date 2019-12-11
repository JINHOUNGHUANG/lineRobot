package line.robot.message_object;

public class VideoMessage extends BaseMessage{
	private String originalContentUrl;
	private String previewImageUrl;
	public VideoMessage(String originalContentUrl, String previewImageUrl) {
		super("video");
		this.originalContentUrl = originalContentUrl;
		this.previewImageUrl = previewImageUrl;
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
		return "{\"originalContentUrl\":\"" + originalContentUrl + "\", \"previewImageUrl\":\"" + previewImageUrl + "\", \"type\":\"video\"}";
	}
}
