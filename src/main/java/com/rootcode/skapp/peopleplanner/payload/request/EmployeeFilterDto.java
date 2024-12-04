package com.rootcode.skapp.peopleplanner.payload.request;

import com.rootcode.skapp.peopleplanner.type.AccountStatus;
import com.rootcode.skapp.peopleplanner.type.EmployeeSort;
import com.rootcode.skapp.peopleplanner.type.EmployeeType;
import com.rootcode.skapp.peopleplanner.type.EmploymentAllocation;
import com.rootcode.skapp.peopleplanner.type.Gender;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class EmployeeFilterDto {

	@Min(0)
	private int page = 0;

	@Min(1)
	private int size = 5;

	private EmployeeSort sortKey = EmployeeSort.NAME;

	private Sort.Direction sortOrder = Sort.Direction.ASC;

	private List<Long> team;

	private List<Long> role;

	private List<String> permissions;

	private List<EmployeeType> employmentTypes;

	private List<AccountStatus> accountStatus = new ArrayList<>(Collections.singletonList(AccountStatus.ACTIVE));

	private List<EmploymentAllocation> employmentAllocations;

	private Boolean isExport = false;

	private String searchKeyword;

	private Gender gender;

	private List<String> nationality;

}
