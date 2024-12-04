package com.rootcode.skapp.leaveplanner.payload;

import com.rootcode.skapp.leaveplanner.type.LeaveRequestSort;
import com.rootcode.skapp.leaveplanner.type.LeaveRequestStatus;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class TeamLeaveHistoryFilterDto {

	@Min(0)
	private int page = 0;

	@Min(1)
	private int size = 10;

	private List<LeaveRequestStatus> status;

	private List<Long> leaveType;

	private LocalDate startDate;

	private LocalDate endDate;

	private List<Long> teamMemberIds;

	private Boolean isExport = false;

	private Sort.Direction sortOrder = Sort.Direction.DESC;

	private LeaveRequestSort sortKey = LeaveRequestSort.START_DATE;

}
