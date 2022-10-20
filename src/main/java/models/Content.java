package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Content {
	private Integer id;
	private String title;
	private int type_id;
	private int category_id;
	private String summary;
	private String logo_url;
	private String poster_url;
	private String banner_url;
	private String thumbnail_url;
	
	public Content(){
		
	}
	
	public Content(int id, String title, int type_id, int category_id, String summary, String logo_url,
			String poster_url, String banner_url, String thumbnail_url) {
		this.id = id;
		this.title = title;
		this.type_id = type_id;
		this.category_id = category_id;
		this.summary = summary;
		this.logo_url = logo_url;
		this.poster_url = poster_url;
		this.banner_url = banner_url;
		this.thumbnail_url = thumbnail_url;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
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
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}
	public String getPoster_url() {
		return poster_url;
	}
	public void setPoster_url(String poster_url) {
		this.poster_url = poster_url;
	}
	public String getBanner_url() {
		return banner_url;
	}
	public void setBanner_url(String banner_url) {
		this.banner_url = banner_url;
	}
	public String getThumbnail_url() {
		return thumbnail_url;
	}
	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}

	@Override
	public String toString() {
		return "Content [id=" + id + ", title=" + title + ", type_id=" + type_id + ", category_id=" + category_id
				+ ", summary=" + summary + ", logo_url=" + logo_url + ", poster_url=" + poster_url + ", banner_url="
				+ banner_url + ", thumbnail_url=" + thumbnail_url + "]";
	}
	
	
}
