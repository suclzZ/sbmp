package com.sucl.sbmp.sys.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sucl.sbmp.core.annotation.QueryCondition;
import com.sucl.sbmp.core.annotation.QueryPage;
import com.sucl.sbmp.sys.entity.Dept;
import com.sucl.sbmp.sys.service.IDeptService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sucl.sbmp.core.web.BaseController;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sucl
 * @since 2018-12-08
 */
@RestController
@RequestMapping("/sys/dept")
public class DeptController extends BaseController<IDeptService,Dept> {

}
