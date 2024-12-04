package com.rootcode.skapp.peopleplanner.payload.request;

import com.rootcode.skapp.peopleplanner.type.AccountStatus;
import com.rootcode.skapp.peopleplanner.type.EEO;
import com.rootcode.skapp.peopleplanner.type.EmploymentAllocation;
import com.rootcode.skapp.peopleplanner.type.Gender;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class EmployeeBulkDto {

	private String identificationNo;

	private String workEmail;

	private String personalEmail;

	private String firstName;

	private String middleName;

	private String lastName;

	private String country;

	private String timeZone;

	private String primaryManager;

	private String secondaryManager;

	private Set<String> teams;

	private Gender gender;

	private String phone;

	private String address;

	private String addressLine2;

	private LocalDate joinedDate;

	private EEO eeo;

	private EmployeeBulkPersonalInfoDto employeePersonalInfo;

	private ProbationPeriodDto employeePeriod;

	private EmployeeEmergencyDto employeeEmergency;

	private EmployeeProgressionsDto employeeProgression;

	private AccountStatus accountStatus;

	private EmploymentAllocation employmentAllocation;

}
