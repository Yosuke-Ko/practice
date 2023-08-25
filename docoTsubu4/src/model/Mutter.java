package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private int id;
	private String userName;
	private String text;
	private String timestamp;
	private int like;

	public Mutter() {}
	public Mutter(String userName, String text) {
		super();
		this.userName = userName;
		this.text = text;
	}
	public Mutter(String userName, String text, String timestamp) {
		super();
		this.userName = userName;
		this.text = text;
		this.timestamp = timestamp;
	}
	public Mutter(String userName, String text, String timestamp, int like) {
		super();
		this.userName = userName;
		this.text = text;
		this.timestamp = timestamp;
		this.like = like;
	}
	public Mutter(int id, String userName, String text) {
		super();
		this.id = id;
		this.userName = userName;
		this.text = text;
	}
	public Mutter(int id, String userName, String text, String timestamp) {
		super();
		this.id = id;
		this.userName = userName;
		this.text = text;
		this.timestamp = timestamp;
	}
	public Mutter(int id, String userName, String text, String timestamp, int like) {
		super();
		this.id = id;
		this.userName = userName;
		this.text = text;
		this.timestamp = timestamp;
		this.like = like;
	}
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getText() {
		return text;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public int getLike() {
		return like;
	}
}
