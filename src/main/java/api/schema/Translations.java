package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Translations{

	@JsonProperty("br")
	private String br;

	@JsonProperty("de")
	private String de;

	@JsonProperty("pt")
	private String pt;

	@JsonProperty("ja")
	private String ja;

	@JsonProperty("hr")
	private String hr;

	@JsonProperty("it")
	private String it;

	@JsonProperty("fa")
	private String fa;

	@JsonProperty("fr")
	private String fr;

	@JsonProperty("es")
	private String es;

	@JsonProperty("nl")
	private String nl;

	public String getBr(){
		return br;
	}

	public String getDe(){
		return de;
	}

	public String getPt(){
		return pt;
	}

	public String getJa(){
		return ja;
	}

	public String getHr(){
		return hr;
	}

	public String getIt(){
		return it;
	}

	public String getFa(){
		return fa;
	}

	public String getFr(){
		return fr;
	}

	public String getEs(){
		return es;
	}

	public String getNl(){
		return nl;
	}
}