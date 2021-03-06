package vn.myclass.core.service.impl;

import vn.myclass.core.dao.RoleDao;
import vn.myclass.core.daoimpl.RoleDaoImpl;
import vn.myclass.core.dto.RoleDTO;
import vn.myclass.core.persistence.RoleEntity;
import vn.myclass.core.service.RoleService;
import vn.myclass.core.ultils.RoleBeanUtil;

import java.util.ArrayList;
import java.util.List;

public class RoleServiceImpl implements RoleService {
    RoleDao roleDao = new RoleDaoImpl();

    public List<RoleDTO> findAll() {
        List<RoleEntity> entities = roleDao.findAll();
        List<RoleDTO> roleDTOS = new ArrayList<RoleDTO>();
        for(RoleEntity items : entities){
            RoleDTO roleDTO = RoleBeanUtil.entitytoDTO(items);
            roleDTOS.add(roleDTO);
        }
        return roleDTOS;
    }
}
