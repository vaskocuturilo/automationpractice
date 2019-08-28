package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class NonExistentCountry {

	@JsonProperty("message")
	private String message;

	@JsonProperty("status")
	private int status;

	public void setMessage(final String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(final int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"NonExistentCountry{" +
			"message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}