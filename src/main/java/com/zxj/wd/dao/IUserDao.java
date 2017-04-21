package com.zxj.wd.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by chris on 2017/4/21.
 */
public interface IUserDao {

    public Map getUserById(Integer id)throws SQLException;

    public List<Map> getAllUsers()throws SQLException;

}
