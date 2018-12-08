package com.sucl.sbmp.sys.service.impl;

import com.sucl.sbmp.sys.entity.Dept;
import com.sucl.sbmp.sys.mapper.DeptMapper;
import com.sucl.sbmp.sys.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sucl
 * @since 2018-12-08
 */
@Service
@Transactional
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
