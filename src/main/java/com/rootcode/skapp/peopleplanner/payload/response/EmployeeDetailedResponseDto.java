package com.rootcode.skapp.peopleplanner.payload.response;

import com.rootcode.skapp.peopleplanner.payload.request.EmployeeEducationDto;
import com.rootcode.skapp.peopleplanner.payload.request.EmployeeEmergencyDto;
import com.rootcode.skapp.peopleplanner.payload.request.EmployeeFamilyDto;
import com.rootcode.skapp.peopleplanner.payload.request.EmployeePersonalInfoDto;
import com.rootcode.skapp.peopleplanner.payload.request.EmploymentVisaDto;
import com.rootcode.skapp.peopleplanner.type.AccountStatus;
import com.rootcode.skapp.peopleplanner.type.EEO;
import com.rootcode.skapp.peopleplanner.type.EmploymentAllocation;
import com.rootcode.skapp.peopleplanner.type.Ethnicity;
import com.rootcode.skapp.peopleplanner.type.Gender;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class EmployeeDetailedResponseDto {

	private String employeeId;

	private String firstName;

	private String lastName;

	private String middleName;

	private String address;

	private String addressLine2;

	private String designation;

	private String authPic;

	private String identificationNo;

	private String country;

	private String phone;

	private String timeZone;

	private Gender gender;

	private Date joinDate;

	private String personalEmail;

	private String email;

	private Boolean isActive;

	private JobTitleDto jobTitle;

	private EmployeeJobFamilyDto jobFamily;

	private EmployeePeriodResponseDto periodResponseDto;

	private EmploymentAllocation employmentAllocation;

	private AccountStatus accountStatus;

	private List<ManagerResponseDto> managers;

	private List<EmployeeProgressionResponseDto> employeeProgressions;

	private List<TeamEmployeeResponseDto> teams;

	private List<EmployeeEmergencyDto> employeeEmergencies;

	private EEO eeo;

	private Ethnicity ethnicity;

	private List<EmploymentVisaDto> employeeVisas;

	private EmployeePersonalInfoDto personalInfo;

	private List<EmployeeEducationDto> employeeEducations;

	private List<EmployeeFamilyDto> employeeFamilies;

	private EmployeeCredentialsResponseDto employeeCredentials;

	private EmployeeRoleResponseDto employeeRole;

}
