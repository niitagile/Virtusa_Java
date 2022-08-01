package com.rest.example.model;
import javax.persistence.*;
@Entity
@Table(name = "tutorials")
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "title",length=10)
	private String title;
	@Column(name = "description",length=100)
	private String description;
	@Column(name = "published")
	private boolean published;
	public Tutorial() {
	}
	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}
}