package com.project.EventProject.repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.micrometer.observation.Observation.Event;
	@Repository
	@Qualifier("eveRepo")
	public interface EventRepository extends JpaRepository<Event, Long>{
}
