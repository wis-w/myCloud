package com.edu.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 20:48
 */
public class Storage {
    /**
     * CREATE TABLE `t_storage` (
     * `id` bigint NOT NULL AUTO_INCREMENT,
     * `product_id` bigint DEFAULT NULL COMMENT '产品id',
     * `total` bigint DEFAULT NULL COMMENT '总库存',
     * `used` bigint DEFAULT NULL COMMENT '已用库存',
     * `residue` bigint DEFAULT NULL COMMENT '剩余库存',
     * PRIMARY KEY (`id`)
     * ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
     */
    private Long id;
    private Long productId;
    private Long total;
    private Long used;
    private Long residue;

    @Override
    public String toString() {
        return "StorageDao{" +
                "id=" + id +
                ", productId=" + productId +
                ", total=" + total +
                ", used=" + used +
                ", residue=" + residue +
                '}';
    }

    public Storage(Long id, Long productId, Long total, Long used, Long residue) {
        this.id = id;
        this.productId = productId;
        this.total = total;
        this.used = used;
        this.residue = residue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getUsed() {
        return used;
    }

    public void setUsed(Long used) {
        this.used = used;
    }

    public Long getResidue() {
        return residue;
    }

    public void setResidue(Long residue) {
        this.residue = residue;
    }
}
