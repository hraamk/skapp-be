package com.rootcode.skapp.peopleplanner.repository.impl;

import com.rootcode.skapp.leaveplanner.type.ManagerType;
import com.rootcode.skapp.peopleplanner.model.Employee;
import com.rootcode.skapp.peopleplanner.model.EmployeeManager;
import com.rootcode.skapp.peopleplanner.model.EmployeeManager_;
import com.rootcode.skapp.peopleplanner.repository.EmployeeManagerRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class EmployeeManagerRepositoryImpl implements EmployeeManagerRepository {

	@NonNull
	private final EntityManager entityManager;

	@Override
	public void deleteByEmployeeAndManagerType(Employee employee, ManagerType managerType) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaDelete<EmployeeManager> criteriaDelete = criteriaBuilder.createCriteriaDelete(EmployeeManager.class);
		Root<EmployeeManager> root = criteriaDelete.from(EmployeeManager.class);

		List<Predicate> predicates = new ArrayList<>();
		predicates.add(criteriaBuilder.equal(root.get(EmployeeManager_.employee), employee));
		predicates.add(criteriaBuilder.equal(root.get(EmployeeManager_.managerType), managerType));

		criteriaDelete.where(predicates.toArray(new Predicate[0]));

		entityManager.createQuery(criteriaDelete).executeUpdate();
	}

}
