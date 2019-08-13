package com.chadianmeiyou.haihuanguser.controller;


import com.chadianmeiyou.haihuanguser.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.enums.SexEnum;
import haihuang.resp.CommenResp;
import haihuang.resp.GetMessageCodeResp;
import haihuang.resp.MessageCode;
import haihuang.tools.GetMessageCode;
import haihuang.vo.UserVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    /**
     * 短信验证
     * @param phone
     * @return
     */
    @RequestMapping(value = "/getMessageCode",method = RequestMethod.POST,produces = "application/json")
    public CommenResp<MessageCode> getMessageCode(String phone) {
        CommenResp<MessageCode> resp = new CommenResp<MessageCode>();
        MessageCode code = new MessageCode();
        try{
            GetMessageCodeResp res = GetMessageCode.getCode(phone);
            code.setMessageCode(res.getMessageCode());
            code.setPhone(phone);
            resp.setBody(code);
            if(!"0000".equals(res.getRespCode())){
                resp.setType("E");
                resp.setMsg(res.getRespDesc());
            }
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg(e.getMessage());
        }
        return resp;
    }
    /**
     * 注册
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/editUser",method = RequestMethod.POST,produces = "application/json")
    public CommenResp editUser(UserVo userVo) {
        CommenResp resp = new CommenResp();
        try{
            SexEnum.BOY.toString();
            userService.editUser(userVo);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg(e.getMessage());
        }
        return resp;
    }


    /**
     * 登录
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = "application/json")
    public CommenResp<UserVo> login(UserVo userVo) {
        CommenResp<UserVo> resp = new CommenResp<UserVo>();
        try{
            UserVo  usesr = userService.selectUserByLogin(userVo);
            resp.setBody(usesr);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg(e.getMessage());
        }
        return resp;
    }

    /**
     * 根据条件查询用户
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/queryUser",method = RequestMethod.POST,produces = "application/json")
    public CommenResp<UserVo> queryUser(UserVo userVo) {
        CommenResp<UserVo> resp = new CommenResp<UserVo>();
        try{
            UserVo  usesr = userService.selectUserByVo(userVo);
            resp.setBody(usesr);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg(e.getMessage());
        }
        return resp;
    }

    /**
     * 分页查询用户
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/queryUserByPage",method = RequestMethod.POST,produces = "application/json")
    public CommenResp<PageInfo<UserVo>> queryUserByPage(UserVo userVo, Page page) {
        CommenResp<PageInfo<UserVo>> resp = new CommenResp<PageInfo<UserVo>>();
        try{
            PageInfo<UserVo> usesr = userService.selectUserByPage(userVo,page);
            resp.setBody(usesr);
        }catch(Exception e){
            e.printStackTrace();
            resp.setType("E");
            resp.setMsg(e.getMessage());
        }
        return resp;
    }
}
