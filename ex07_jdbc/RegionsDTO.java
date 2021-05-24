package ex07_jdbc;

public class RegionsDTO {

	private int regions_id;
	private String regions_name;
	
	
	public RegionsDTO() {
		super();
	}

	public RegionsDTO(int regions_id, String regions_name) {
		super();
		this.regions_id = regions_id;
		this.regions_name = regions_name;
	}

	public int getRegions_id() {
		return regions_id;
	}

	public void setRegions_id(int regions_id) {
		this.regions_id = regions_id;
	}

	public String getRegions_name() {
		return regions_name;
	}

	public void setRegions_name(String regions_name) {
		this.regions_name = regions_name;
	}

	@Override
	public String toString() {
		return "RegionsDTO [regions_id=" + regions_id + ", regions_name=" + regions_name + "]";
	}

	
	

	
	
	
	
	
	
	
}
