package com.hloong.intelligallery.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hloong.intelligallery.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hloong.intelligallery.model.dto.user.UserQueryRequest;
import com.hloong.intelligallery.model.vo.LoginUserVO;
import com.hloong.intelligallery.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author lenovo
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-12-16 00:24:38
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);


    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获得脱敏后的用户信息
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 对用户密码进行加密
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取单个脱敏用户
     * @param user 脱敏前用户
     * @return 脱敏后用户
     */
    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 是否为管理员
     *
     * @param user
     * @return
     */
    boolean isAdmin(User user);

}
