/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.psa.backend.respository;

import cl.psa.backend.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Duoc
 */
public interface PlanRespository extends JpaRepository<Plan, Long>{
    
}
