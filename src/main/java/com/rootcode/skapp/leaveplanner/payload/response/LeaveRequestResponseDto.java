package com.rootcode.skapp.leaveplanner.payload.response;

import com.rootcode.skapp.leaveplanner.type.LeaveRequestStatus;
import com.rootcode.skapp.leaveplanner.type.LeaveState;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class LeaveRequestResponseDto {

	private Long leaveRequestId;

	private LocalDate startDate;

	private LocalDate endDate;

	private LeaveTypeBasicDetailsResponseDto leaveType;

	private LeaveState leaveState;

	private LeaveRequestStatus status;

	private Boolean isViewed;

	private Float durationDays;

	private String requestDesc;

	private LocalDateTime createdDate;

}
