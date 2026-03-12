/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.psa.backend.controller;

import cl.psa.backend.model.Plan;
import cl.psa.backend.respository.PlanRespository;
import java.util.List;
import org.aspectj.apache.bcel.Repository;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Duoc
 */
@RestController
@RequestMapping("/api/planes")
@CrossOrigin("*")
public class PlanController {
    private final PlanRespository respository;

    public PlanController(PlanRespository respository) {
        this.respository = respository;
    }
    
    @GetMapping
    public List<Plan> getPlanes (){
        return respository.findAll();
    }
}
