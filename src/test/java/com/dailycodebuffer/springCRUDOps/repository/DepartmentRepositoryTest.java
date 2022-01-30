package com.dailycodebuffer.springCRUDOps.repository;

import com.dailycodebuffer.springCRUDOps.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    private DepartmentRepository departmentRepository;

    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("Mechanical Eng")
                .departmentCode("ME")
                .departmentAddress("Bangalore")
                .build();

        entityManager.persist(department);
    }

    public void whenFindById_thenReturnDepartment(){
        Department department = departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentName(), "Mechanical Eng");
    }
}