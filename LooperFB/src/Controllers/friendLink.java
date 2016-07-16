package Controllers;

public class friendLink {
	private String name ;
	private String url ;
	public friendLink(String name , String url){
		this.name = name;
		this.url = url;
	}
	public void setName(String name ){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String link){
		this.url = link;
	}

}
