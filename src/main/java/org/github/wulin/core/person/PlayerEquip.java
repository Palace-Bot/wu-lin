package org.github.wulin.core.person;

import lombok.Data;
import org.github.wulin.core.equip.AbstractEquip;

/**
 * 装备
 *
 * @author jihongyuan
 * @date 2022/4/14 10:44
 */
@Data
public class PlayerEquip {

    /**
     * 头盔
     */
    private AbstractEquip head;

    /**
     * 衣服
     */
    private AbstractEquip body;

    /**
     * 护腿
     */
    private AbstractEquip leg;

    /**
     * 鞋子
     */
    private AbstractEquip shoes;

    /**
     * 护腕
     */
    private AbstractEquip bracelet;

    /**
     * 武器
     */
    private AbstractEquip weapon1;

    /**
     * 武器
     */
    private AbstractEquip weapon2;

}
