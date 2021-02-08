package org.acme.test1;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Panache repository (with Quarkus Spring compatibility api)
 */
public interface TestEntity1Repository extends JpaRepository<TestEntity1, Long> {
}
