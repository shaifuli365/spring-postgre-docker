package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BranchService {

  private static int v = 1;
  private final BranchRepo branchRepo;

  public void save() {
    branchRepo.save(new Branch().setName("Branch "+v));
    v++;
  }

  public List<Branch> get() {
    return branchRepo.findAll();
  }

}
