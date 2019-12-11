package line.robot.message_object;

public class StickerMessage extends BaseMessage{
	private String packageId;
	private String stickerId;
	public StickerMessage(String packageId, String stickerId) {
		super("sticker");
		this.packageId = packageId;
		this.stickerId = stickerId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setStickerId(String stickerId) {
		this.stickerId = stickerId;
	}
	public String getStickerId() {
		return stickerId;
	}
	@Override
	public String toString() {
		return "{\"type\":\"sticker\",\"packageId\":\""+packageId+"\",\"stickerId\":\""+stickerId+"\"}";
	}
}
