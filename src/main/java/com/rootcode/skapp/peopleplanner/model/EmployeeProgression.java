package com.rootcode.skapp.peopleplanner.model;

import com.rootcode.skapp.peopleplanner.type.EmployeeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "employee_progression")
public class EmployeeProgression {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "progression_id")
	private Long progressionId;

	@Column(name = "employee_type", columnDefinition = "varchar(255)")
	@Enumerated(EnumType.STRING)
	private EmployeeType employeeType;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@Column(name = "is_current")
	private Boolean isCurrent;

	@ManyToOne(optional = false)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@ManyToOne(optional = false)
	@JoinColumn(name = "job_family_id")
	private JobFamily jobFamily;

	@ManyToOne(optional = false)
	@JoinColumn(name = "job_title_id")
	private JobTitle jobTitle;

}
