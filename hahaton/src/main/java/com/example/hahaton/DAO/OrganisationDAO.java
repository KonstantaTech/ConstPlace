package com.example.hahaton.DAO;

import com.example.hahaton.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationDAO extends JpaRepository<Organisation, Long> {

    @Query("select o from Organisation o where o.organisationId = :id")
    Organisation getOrganisationById(@Param("id") Long organisationId);

}
