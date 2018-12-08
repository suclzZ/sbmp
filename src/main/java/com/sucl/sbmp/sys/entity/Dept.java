package com.sucl.sbmp.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.sucl.sbmp.core.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sucl
 * @since 2018-12-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
//@Accessors(chain = true)
public class Dept extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    @TableField("DEPT_NO")
    private String deptNo;

    @TableField("DEPT_NAME")
    private String deptName;

    @TableField("DEPT_PARENT_NO")
    private String deptParentNo;

    @TableField("DUTY")
    private String duty;

    @TableField("CONTACT")
    private String contact;


}
