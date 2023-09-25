package com.jxyy.eshop.bean.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_product")
public class Product extends Base implements Serializable {
    @Serial
    private static final long serialVersionUID = -4644407386444894349L;

    @TableId
    private Long prodId;

    private String prodName;

    private BigDecimal oriPrice;

    private BigDecimal salePrice;
}
