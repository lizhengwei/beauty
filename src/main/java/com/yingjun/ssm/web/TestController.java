package com.yingjun.ssm.web;

import com.yingjun.ssm.dto.BaseResult;
import com.yingjun.ssm.entity.Goods;
import com.yingjun.ssm.entity.Order;
import com.yingjun.ssm.entity.User;
import com.yingjun.ssm.enums.ResultEnum;
import com.yingjun.ssm.exception.BizException;
import com.yingjun.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.validation.Valid;

@Controller
@RequestMapping("/test")
public class TestController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<Object> test() {
        return new BaseResult<Object>(true, new Order());
    }

}
