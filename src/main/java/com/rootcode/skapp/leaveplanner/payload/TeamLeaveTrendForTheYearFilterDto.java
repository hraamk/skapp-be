package com.rootcode.skapp.leaveplanner.payload;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class TeamLeaveTrendForTheYearFilterDto {

	private Long teamId;

	private List<Long> leaveTypeIds;

	private LocalDate startDate;

	private LocalDate endDate;

}
