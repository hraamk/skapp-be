package com.rootcode.skapp.peopleplanner.payload.request;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rootcode.skapp.peopleplanner.type.BloodGroup;
import com.rootcode.skapp.peopleplanner.type.Ethnicity;
import com.rootcode.skapp.peopleplanner.type.MaritalStatus;
import com.rootcode.skapp.peopleplanner.util.deserializer.BloodGroupDeserializer;
import com.rootcode.skapp.peopleplanner.util.deserializer.EthnicityDeserializer;
import com.rootcode.skapp.peopleplanner.util.deserializer.MaritalStatusDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeePersonalInfoDto {

	private Long personalInfoId;

	private String city;

	private String state;

	private String postalCode;

	private LocalDate birthDate;

	@JsonDeserialize(using = EthnicityDeserializer.class)
	private Ethnicity ethnicity;

	private String ssn;

	private JsonNode previousEmploymentDetails;

	private String nationality;

	private String nin;

	private String passportNo;

	@JsonDeserialize(using = MaritalStatusDeserializer.class)
	private MaritalStatus maritalStatus;

	private JsonNode socialMediaDetails;

	@JsonDeserialize(using = BloodGroupDeserializer.class)
	private BloodGroup bloodGroup;

	private JsonNode extraInfo;

}
