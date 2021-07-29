package com.github.patsalyukas.quadraticequation.controllers;

import com.github.patsalyukas.quadraticequation.services.SolverQuadraticEquation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EquationController {

    private SolverQuadraticEquation solverQuadraticEquation;

    @GetMapping("/quadraticequation")
    public ResponseEntity<String> solve(@RequestParam double a, @RequestParam double b, @RequestParam double c){
        return new ResponseEntity<>(solverQuadraticEquation.solve(a, b, c), HttpStatus.OK);
    }

}
