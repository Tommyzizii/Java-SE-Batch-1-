package libraryManagementSystem;

public class Book {
	
	private String title;
	private String subTitle;
	static int count;
	
	public Book(String title) {
		super();
		this.title = title;
		count++;
	}
	
	public Book(String title, String subTitle) {
		super();
		this.title = title;
		this.subTitle = subTitle;
		count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public int getCount() {
		return count;
	}
	
	public void dislay() {
		System.out.println("Title: " + title);
		if (subTitle != null){
			System.out.println("Subtitle: " + subTitle);
		}
		
	}

	
}
