package com.akash.PPMTool.repositories;

import com.akash.PPMTool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository   extends CrudRepository<Project,Long>
{

}
