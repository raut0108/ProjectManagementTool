package com.akash.PPMTool.Services;

import com.akash.PPMTool.domain.Project;
import com.akash.PPMTool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService
{
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project)
    {
       return  projectRepository.save(project);
    }
}
