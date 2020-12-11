package lesson20.services;

import lesson20.dao.ProjectDao;
import lesson20.dao.ProjectDaoImpl;
import lesson20.entities.Project;

public class ProjectServiceImpl implements ProjectService {
    @Override
    public void save(Project project) {
        ProjectDao projectDao = new ProjectDaoImpl();
        projectDao.save(project);
    }
}
