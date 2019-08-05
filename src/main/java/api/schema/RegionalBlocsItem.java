package api.schema;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RegionalBlocsItem{

	@JsonProperty("otherNames")
	private List<Object> otherNames;

	@JsonProperty("acronym")
	private String acronym;

	@JsonProperty("name")
	private String name;

	@JsonProperty("otherAcronyms")
	private List<Object> otherAcronyms;

	public List<Object> getOtherNames(){
		return otherNames;
	}

	public String getAcronym(){
		return acronym;
	}

	public String getName(){
		return name;
	}

	public List<Object> getOtherAcronyms(){
		return otherAcronyms;
	}
}