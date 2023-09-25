package com.jxyy.eshop.bean.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_user")
public class User extends Base implements Serializable {
    @Serial
    private static final long serialVersionUID = 2090714647038636896L;
}
