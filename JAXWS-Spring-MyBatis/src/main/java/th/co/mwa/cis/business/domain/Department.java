package th.co.mwa.cis.business.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Department implements Serializable {

	private String departmentId;
	private String departmentName;
	private int level;

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
