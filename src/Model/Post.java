package Model;

public class Post {
    private int id;
    private String title;
    private String ptext;
    private String auther;
    private String pdate;
    private int lokeNo;
    
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(String title, String ptext, String auther, String pdate, int lokeNo) {
		super();
		this.title = title;
		this.ptext = ptext;
		this.auther = auther;
		this.pdate = pdate;
		this.lokeNo = lokeNo;
	}

	public Post(int id, String title, String ptext, String auther, String pdate, int lokeNo) {
		super();
		this.id = id;
		this.title = title;
		this.ptext = ptext;
		this.auther = auther;
		this.pdate = pdate;
		this.lokeNo = lokeNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPtext() {
		return ptext;
	}

	public void setPtext(String ptext) {
		this.ptext = ptext;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	public int getLokeNo() {
		return lokeNo;
	}

	public void setLokeNo(int lokeNo) {
		this.lokeNo = lokeNo;
	}
	

}
