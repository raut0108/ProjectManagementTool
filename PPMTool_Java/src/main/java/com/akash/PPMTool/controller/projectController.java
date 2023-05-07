package com.akash.PPMTool.controller;

import com.akash.PPMTool.Services.ProjectService;
import com.akash.PPMTool.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class projectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project)
    {
        Project proj1 = projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(proj1, HttpStatus.CREATED);
    }


}
