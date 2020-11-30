package lesson17.services;

import lesson17.dao.RoleDao;
import lesson17.dao.RoleDaoImpl;
import lesson17.entities.Role;

public class RoleServiceImpl implements RoleService {

    @Override
    public void save(Role role) {
        RoleDao roleDao = new RoleDaoImpl();
        roleDao.save(role);
    }
}
