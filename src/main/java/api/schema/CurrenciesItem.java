package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CurrenciesItem{

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("code")
	private String code;

	@JsonProperty("name")
	private String name;

	public String getSymbol(){
		return symbol;
	}

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}
}