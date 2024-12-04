package com.rootcode.skapp.leaveplanner.repository.projection;

public interface EmployeeLeaveEntitlementTeamJobRole {

	Long getEmployeeId();

	String getEmployeeName();

	String getTeams();

	String getLeaveName();

	Float getTotalDaysAllocated();

	Float getTotalDaysUsed();

	Float getTotalBalanceDays();

}
