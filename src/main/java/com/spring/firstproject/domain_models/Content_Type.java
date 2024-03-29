package com.spring.firstproject.domain_models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`content_type`")
public class Content_Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String type;
	
	public Content_Type() {
	}

	public Content_Type(Integer id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
//	@OneToMany(cascade = CascadeType.ALL, 
//	mappedBy = "content", orphanRemoval = true)
//	private List<Content> content = new ArrayList<>();
	
}
