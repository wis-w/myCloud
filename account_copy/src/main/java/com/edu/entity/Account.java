package com.edu.entity;


import java.math.BigDecimal;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/20 20:42
 */
public class Account {
    /**
     * CREATE TABLE `t_account` (
     *   `id` bigint NOT NULL AUTO_INCREMENT,
     *   `user_id` bigint DEFAULT NULL COMMENT '用户id',
     *   `total` bigint DEFAULT NULL COMMENT '总额度',
     *   `used` bigint DEFAULT NULL COMMENT '已用额度',
     *   `residue` bigint DEFAULT NULL COMMENT '剩余额度',
     *   PRIMARY KEY (`id`)
     * ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
     */
    private long id;
    private long userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getUsed() {
        return used;
    }

    public void setUsed(BigDecimal used) {
        this.used = used;
    }

    public BigDecimal getResidue() {
        return residue;
    }

    public void setResidue(BigDecimal residue) {
        this.residue = residue;
    }
}
