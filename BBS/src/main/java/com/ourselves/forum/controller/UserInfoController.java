package com.ourselves.forum.controller;

import com.ourselves.forum.entity.UserInfo;
import com.ourselves.forum.service.UserInfoService;
import com.ourselves.forum.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午9:44
 * 控制层
 */
@Controller
@RequestMapping("/")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    private UserInfo userInfo;

    private List<UserInfo> userInfoList;

    @RequestMapping("/user/register")
    public String add(UserInfo userInfo) {
        if (this.userInfoService.queryByUsername(userInfo.getUsername())) {
            if (this.userInfoService.queryByNickname(userInfo.getNickname())) {
                if (this.userInfoService.addUser(userInfo)) {
                    return "status/success";
                }
                return "errorpage/600";
            }
        }
        return "errorpage/600";
    }

    @RequestMapping("/index")
    public String login(UserInfo userInfo, HttpSession session) {
        userInfo = this.userInfoService.login(userInfo);
        if (userInfo != null) {
            return "status/success1";
        } else {
            return "index";
        }
    }

    @RequestMapping("/user/userAlllist.do")
    public String queryAll(Page page, HttpServletRequest request) {
        if (page == null) {
            page = new Page();
            page.setCurrentpage(1);
        }
        userInfoList = this.userInfoService.queryAll(page);
        request.setAttribute("userInfoList", userInfoList);
        return "user/userAlllist";
    }

    @RequestMapping("/user/delete/{nickname}.do")
    public String deleteUser(@PathVariable String nickname) {
        this.userInfoService.delete(nickname);
        return "redirect:/user/userAlllist.do";
    }

    @RequestMapping("/user/user/{id}.do")
    public String showUser(@PathVariable int id, HttpServletRequest request) {
        UserInfo userInfo1 = this.userInfoService.queryAllUser(id);
        request.setAttribute("userInfo1", userInfo1);
        return "user/user";
    }

    @RequestMapping("/user/update/{id}.do")
    public String update(@PathVariable int id, UserInfo userInfo) {
        if (this.userInfoService.update(userInfo)) {
            return "redirect:/user/user/{id}.do";
        }
        return "errorpage/600";
    }

    @RequestMapping("/user/updateuser/{id}.do")
    public String updateuser(@PathVariable int id, HttpServletRequest request) {
        UserInfo userInfo1 = this.userInfoService.queryAllUser(id);
        request.setAttribute("userInfo1", userInfo1);
        return "user/updateUser";
    }

    @RequestMapping("/user/updatepassword/{username}.do")
    public String updatepassword(@PathVariable String username, HttpServletRequest request) {
        UserInfo userInfo1 = this.userInfoService.queryAlluser(username);
        request.setAttribute("userInfo1", userInfo1);
        return "user/updateUser";
    }
    @RequestMapping("/user/update/{username}.do")
    public String updatePwd(@PathVariable String username, UserInfo userInfo){
        if(this.userInfoService.updatePwd(userInfo)){
            return "index";
        }
        return "errorpage/600";
    }
}
