package com.cst438.domain;

public class StudentDTO {
	
	public int id;
	public String email;
	public String name;
	public String status;
	public int statusCode;
	
	public StudentDTO() {
		this.id = 0;
		this.email=null;
		this.name=null;
		this.status=null;
		this.statusCode=0;
	}
	
	
	public StudentDTO(String studentEmail, String studentName, String status, int statusCode) {
		this.id = 0;
		this.email=studentEmail;
		this.name=studentName;
		this.status=status;
		this.statusCode=statusCode;
	}


	@Override
	public String toString() {
		return "ScheduleDTO [id=" + id + ", studentEmail=" + email + ", studentName=" + name
				 + ", status=" + status + ", statusCode=" + statusCode + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		if (id != other.id)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (statusCode != other.statusCode)
			return false;
		return true;
	}
	
	
	
	
}