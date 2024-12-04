package com.rootcode.skapp.leaveplanner.payload.response;

import com.rootcode.skapp.peopleplanner.payload.response.HolidayBasicDetailsResponseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class ResourceAvailabilityCalendarResponseDto {

	private String date;

	private LocalDate actualDate;

	private String dayOfWeek;

	private int leaveCount;

	private int availableCount;

	private List<LeaveRequestWithEmployeeResponseDto> leaveRequests;

	private List<HolidayBasicDetailsResponseDto> holidays;

}
