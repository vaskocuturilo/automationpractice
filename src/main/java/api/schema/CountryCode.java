package api.schema;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Country code.
 */
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

	/**
	 * Get area int.
	 *
	 * @return the int
	 */
	public int getArea(){
		return area;
	}

	/**
	 * Get native name string.
	 *
	 * @return the string
	 */
	public String getNativeName(){
		return nativeName;
	}

	/**
	 * Get capital string.
	 *
	 * @return the string
	 */
	public String getCapital(){
		return capital;
	}

	/**
	 * Get demonym string.
	 *
	 * @return the string
	 */
	public String getDemonym(){
		return demonym;
	}

	/**
	 * Get flag string.
	 *
	 * @return the string
	 */
	public String getFlag(){
		return flag;
	}

	/**
	 * Get alpha 2 code string.
	 *
	 * @return the string
	 */
	public String getAlpha2Code(){
		return alpha2Code;
	}

	/**
	 * Get languages list.
	 *
	 * @return the list
	 */
	public List<LanguagesItem> getLanguages(){
		return languages;
	}

	/**
	 * Get borders list.
	 *
	 * @return the list
	 */
	public List<String> getBorders(){
		return borders;
	}

	/**
	 * Get subregion string.
	 *
	 * @return the string
	 */
	public String getSubregion(){
		return subregion;
	}

	/**
	 * Get calling codes list.
	 *
	 * @return the list
	 */
	public List<String> getCallingCodes(){
		return callingCodes;
	}

	/**
	 * Get regional blocs list.
	 *
	 * @return the list
	 */
	public List<RegionalBlocsItem> getRegionalBlocs(){
		return regionalBlocs;
	}

	/**
	 * Get gini double.
	 *
	 * @return the double
	 */
	public double getGini(){
		return gini;
	}

	/**
	 * Get population int.
	 *
	 * @return the int
	 */
	public int getPopulation(){
		return population;
	}

	/**
	 * Get numeric code string.
	 *
	 * @return the string
	 */
	public String getNumericCode(){
		return numericCode;
	}

	/**
	 * Get alpha 3 code string.
	 *
	 * @return the string
	 */
	public String getAlpha3Code(){
		return alpha3Code;
	}

	/**
	 * Get top level domain list.
	 *
	 * @return the list
	 */
	public List<String> getTopLevelDomain(){
		return topLevelDomain;
	}

	/**
	 * Get timezones list.
	 *
	 * @return the list
	 */
	public List<String> getTimezones(){
		return timezones;
	}

	/**
	 * Get cioc string.
	 *
	 * @return the string
	 */
	public String getCioc(){
		return cioc;
	}

	/**
	 * Get translations translations.
	 *
	 * @return the translations
	 */
	public Translations getTranslations(){
		return translations;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Get alt spellings list.
	 *
	 * @return the list
	 */
	public List<String> getAltSpellings(){
		return altSpellings;
	}

	/**
	 * Get region string.
	 *
	 * @return the string
	 */
	public String getRegion(){
		return region;
	}

	/**
	 * Get latlng list.
	 *
	 * @return the list
	 */
	public List<Integer> getLatlng(){
		return latlng;
	}

	/**
	 * Get currencies list.
	 *
	 * @return the list
	 */
	public List<CurrenciesItem> getCurrencies(){
		return currencies;
	}
}