package com.rootcode.skapp.timeplanner.payload.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rootcode.skapp.common.util.DateTimeUtils;
import com.rootcode.skapp.common.util.deserializer.Base64BooleanDeserializer;
import com.rootcode.skapp.timeplanner.type.SlotType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class TimeSlotDto {

	private Long timeSlotId;

	private Long startTime;

	private Long endTime;

	private SlotType slotType;

	@JsonDeserialize(using = Base64BooleanDeserializer.class)
	private Boolean isActiveRightNow;

	@JsonDeserialize(using = Base64BooleanDeserializer.class)
	private Boolean isManualEntry;

	public LocalDate getStartTime() {
		return this.startTime != null ? DateTimeUtils.getLocalDateFromEpoch(this.startTime) : null;
	}

	public LocalDate getEndTime() {
		return this.endTime != null ? DateTimeUtils.getLocalDateFromEpoch(this.endTime) : null;
	}

}
