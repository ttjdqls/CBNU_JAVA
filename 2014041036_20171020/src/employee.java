class Employee
{
	private String empNo;
	private String name;
	private String part;
	
	public Employee(){
	}
	
	public Employee(String empNo, String name, String part)
	{
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	public String getEmpNo(){
		return empNo;
	}
	
	public String getName() {
	return name;
	}
	
	public String getPart() {
	return part;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	};
	public void setName(String name) {
		this.name = name;
	};
	public void setPart(String part) {
		this.part = part;
	};

	public String resultStr() {
		String result = "";

		result += "��� : " + empNo + "\n";
		result += "�̸� : " + name + "\n";
		result += "�μ� : " + part + "\n";

		return result;
	}	
}

