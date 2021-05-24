package ex07_jdbc;

public class Countries {

//dto 클래스
	private String Country_id;
	private String Country_name;
	private int region_id;
	
	
	
	public Countries() {
		super();
	}

	public Countries(String country_id, String country_name, int region_id) {
		super();
		Country_id = country_id;
		Country_name = country_name;
		this.region_id = region_id;
	}

	public String getCountry_id() {
		return Country_id;
	}

	public void setCountry_id(String country_id) {
		Country_id = country_id;
	}

	public String getCountry_name() {
		return Country_name;
	}

	public void setCountry_name(String country_name) {
		Country_name = country_name;
	}

	public int getRegion_id() {
		return region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}

	@Override
	public String toString() {
		return "Countries [Country_id=" + Country_id + ", Country_name=" + Country_name + ", region_id=" + region_id
				+ "]";
	}
		
	
	
	
	
}
