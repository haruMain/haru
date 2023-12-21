package haru.com.bbs.service;

public class BbsVO {
	private int seq;
	private String bbsMsterId;
	private String title;
	private String content;
	private String atchFileId;
	private String noticeYn;
	private String insDt;
	private String UpdDt;
	private int hit;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getBbsMsterId() {
		return bbsMsterId;
	}
	public void setBbsMsterId(String bbsMsterId) {
		this.bbsMsterId = bbsMsterId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAtchFileId() {
		return atchFileId;
	}
	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}
	public String getNoticeYn() {
		return noticeYn;
	}
	public void setNoticeYn(String noticeYn) {
		this.noticeYn = noticeYn;
	}
	public String getInsDt() {
		return insDt;
	}
	public void setInsDt(String insDt) {
		this.insDt = insDt;
	}
	public String getUpdDt() {
		return UpdDt;
	}
	public void setUpdDt(String updDt) {
		UpdDt = updDt;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	

}
