package com.rootcode.skapp.leaveplanner.payload;

import com.rootcode.skapp.leaveplanner.payload.response.EmployeeCustomEntitlementReportExportDto;
import com.rootcode.skapp.leaveplanner.payload.response.EmployeeLeaveRequestReportExportDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRequestsEntitlementsCustoms {

	private List<EmployeeCustomEntitlementReportExportDto> employeeCustomEntitlementTeamJobRoles;

	private List<EmployeeLeaveRequestReportExportDto> employeeLeaveRequestTeamJobRoleReports;

	private List<EmployeeEntitlementTeamJobRoleDto> employeeEntitlementTeamJobRoleDto;

}
