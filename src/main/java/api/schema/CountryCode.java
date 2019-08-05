package api.schema;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CountryCode{

	@JsonProperty("area")
	private int area;

	@JsonProperty("nativeName")
	private String nativeName;

	@JsonProperty("capital")
	private String capital;

	@JsonProperty("demonym")
	private String demonym;

	@JsonProperty("flag")
	private String flag;

	@JsonProperty("alpha2Code")
	private String alpha2Code;

	@JsonProperty("languages")
	private List<LanguagesItem> languages;

	@JsonProperty("borders")
	private List<String> borders;

	@JsonProperty("subregion")
	private String subregion;

	@JsonProperty("callingCodes")
	private List<String> callingCodes;

	@JsonProperty("regionalBlocs")
	private List<RegionalBlocsItem> regionalBlocs;

	@JsonProperty("gini")
	private double gini;

	@JsonProperty("population")
	private int population;

	@JsonProperty("numericCode")
	private String numericCode;

	@JsonProperty("alpha3Code")
	private String alpha3Code;

	@JsonProperty("topLevelDomain")
	private List<String> topLevelDomain;

	@JsonProperty("timezones")
	private List<String> timezones;

	@JsonProperty("cioc")
	private String cioc;

	@JsonProperty("translations")
	private Translations translations;

	@JsonProperty("name")
	private String name;

	@JsonProperty("altSpellings")
	private List<String> altSpellings;

	@JsonProperty("region")
	private String region;

	@JsonProperty("latlng")
	private List<Integer> latlng;

	@JsonProperty("currencies")
	private List<CurrenciesItem> currencies;

	public int getArea(){
		return area;
	}

	public String getNativeName(){
		return nativeName;
	}

	public String getCapital(){
		return capital;
	}

	public String getDemonym(){
		return demonym;
	}

	public String getFlag(){
		return flag;
	}

	public String getAlpha2Code(){
		return alpha2Code;
	}

	public List<LanguagesItem> getLanguages(){
		return languages;
	}

	public List<String> getBorders(){
		return borders;
	}

	public String getSubregion(){
		return subregion;
	}

	public List<String> getCallingCodes(){
		return callingCodes;
	}

	public List<RegionalBlocsItem> getRegionalBlocs(){
		return regionalBlocs;
	}

	public double getGini(){
		return gini;
	}

	public int getPopulation(){
		return population;
	}

	public String getNumericCode(){
		return numericCode;
	}

	public String getAlpha3Code(){
		return alpha3Code;
	}

	public List<String> getTopLevelDomain(){
		return topLevelDomain;
	}

	public List<String> getTimezones(){
		return timezones;
	}

	public String getCioc(){
		return cioc;
	}

	public Translations getTranslations(){
		return translations;
	}

	public String getName(){
		return name;
	}

	public List<String> getAltSpellings(){
		return altSpellings;
	}

	public String getRegion(){
		return region;
	}

	public List<Integer> getLatlng(){
		return latlng;
	}

	public List<CurrenciesItem> getCurrencies(){
		return currencies;
	}
}