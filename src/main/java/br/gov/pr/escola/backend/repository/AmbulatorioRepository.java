/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gov.pr.escola.backend.repository;

import br.gov.pr.escola.backend.entity.AmbulatorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */

@Repository
public interface AmbulatorioRepository extends JpaRepository<AmbulatorioEntity, Long> {
    
    @Query(value = "SELECT * FROM ambulatorio WHERE num_ambulatorio = :id", nativeQuery = true)
    public AmbulatorioEntity getById(@Param("id") Long id);
    
}
