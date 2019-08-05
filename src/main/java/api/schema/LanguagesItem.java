package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class LanguagesItem{

	@JsonProperty("nativeName")
	private String nativeName;

	@JsonProperty("iso639_2")
	private String iso6392;

	@JsonProperty("name")
	private String name;

	@JsonProperty("iso639_1")
	private String iso6391;

	public String getNativeName(){
		return nativeName;
	}

	public String getIso6392(){
		return iso6392;
	}

	public String getName(){
		return name;
	}

	public String getIso6391(){
		return iso6391;
	}
}