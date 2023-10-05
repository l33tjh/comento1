package domain;
import java.util.*;

public class BoardVO {
	private Integer bno;
	private String title;
	private String content;
	private String wirter;
	private Date regdate;
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
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
	public String getWirter() {
		return wirter;
	}
	public void setWirter(String wirter) {
		this.wirter = wirter;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViecnt() {
		return viecnt;
	}
	public void setViecnt(int viecnt) {
		this.viecnt = viecnt;
	}
	private int viecnt;
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", wirter=" + wirter + ", regdate="
				+ regdate + ", viecnt=" + viecnt + "]";
	}
}
