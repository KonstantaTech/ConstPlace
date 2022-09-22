package com.example.hahaton.DAO;

import com.example.hahaton.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface OfficeDAO extends JpaRepository<Office, Long> {

    @Query("SELECT o from Office o where o.officeId = :office_id")
    Office findOfficeById(@Param("office_id") Long officeId);

    @Query("SELECT o from Office o where o.organisation.organisationId = :organisation_id")
    Collection<Office> findOfficesByOrganisationId(@Param("organisation_id") Long organisationId);
}
