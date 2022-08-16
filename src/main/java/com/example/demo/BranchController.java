package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/branch", produces = {"application/json"})
@Slf4j
@AllArgsConstructor
public class BranchController {

  private final BranchService branchService;

  @PostMapping()
  public ResponseEntity<?> save() {
    branchService.save();
    return new ResponseEntity("success",  new HttpHeaders(), HttpStatus.OK);
  }

  @GetMapping()
  public ResponseEntity<?> get() {
    return new ResponseEntity(branchService.get(),  new HttpHeaders(), HttpStatus.OK);
  }

}
