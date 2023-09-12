package com.trabajo.concierto.repository;

import com.trabajo.concierto.models.Banda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBandaRepository extends JpaRepository<Banda, Long> {
}
