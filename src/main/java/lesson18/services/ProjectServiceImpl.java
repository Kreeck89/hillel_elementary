package lesson18.services;

import lesson18.dao.ProjectDao;
import lesson18.dao.ProjectDaoImpl;
import lesson18.entities.Project;

public class ProjectServiceImpl implements ProjectService {
    @Override
    public void save(Project project) {
        ProjectDao projectDao = new ProjectDaoImpl();
        projectDao.save(project);
    }
}
