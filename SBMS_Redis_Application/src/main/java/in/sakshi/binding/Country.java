package in.sakshi.binding;

import java.io.Serializable;

import lombok.Data;

@Data
public class Country implements Serializable{
	
	private Integer Sno;
	private String name;
	private String countryCode;

}
