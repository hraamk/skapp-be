package com.rootcode.skapp.timeplanner.repository;

import com.rootcode.skapp.timeplanner.model.TimeRecord;
import com.rootcode.skapp.timeplanner.payload.request.AttendanceSummaryDto;
import com.rootcode.skapp.timeplanner.payload.response.TimeSheetSummaryData;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

public interface TimeRecordRepository {

	AttendanceSummaryDto getEmployeeAttendanceSummary(List<Long> employeeIds, LocalDate startDate, LocalDate endDate);

	Optional<TimeRecord> findIncompleteClockoutTimeRecords(LocalDate lastClockInDate, Long employeeId);

	AttendanceSummaryDto findManagerAssignUsersAttendanceSummary(Long managerId, List<Long> teamIds,
			LocalDate startDate, LocalDate endDate);

	TimeSheetSummaryData findTimeSheetSummaryData(LocalDate startDate, LocalDate endDate, List<Long> employeeIds);

	List<TimeRecord> getTimeRecordsByTeam(List<Long> teamsFilter);

	List<TimeRecord> getTimeRecordsByTeamAndMonth(List<Long> teamsFilter, Month selectedMonth, Long currentUserId);

	List<TimeRecord> getTimeRecordsByEmployeeAndMonth(Long employeeId, Month selectedMonth);

	List<TimeRecord> getTimeRecordsByTeamAndDate(List<Long> teamsFilter, LocalDate currentDate, Long currentUserId);

}
