package org.fkit.domain;


 public class Comment {
	private int oid;
	private int id;
	private int userid;
	private String username;
	private String service;
	private String logistics; //物流
	private String quality;
	private String comments;
	private String image;

	
	
	
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}

		public String getService() {
			return service;
		}
		public void setService(String service) {
			this.service = service;
		}
		public String getLogistics() {
			return logistics;
		}
		public void setLogistics(String logistics) {
			this.logistics = logistics;
		}
		public String getQuality() {
			return quality;
		}
		public void setQuality(String quality) {
			this.quality = quality;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		

		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public int getOid() {
			return oid;
		}
		public void setOid(int oid) {
			this.oid = oid;
		}
		@Override
		public String toString() {
			return "Comment [id=" + id + ",oid=" + oid + ", userid=" + userid+ ", username=" + username + ", service="+ service + ", logistics=" + logistics + ", quality= "+ quality +",comments=" + comments + ",image=" + image + "]";
		}
	}

