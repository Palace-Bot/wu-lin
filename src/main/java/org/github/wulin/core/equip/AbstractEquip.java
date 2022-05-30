package org.github.wulin.core.equip;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 抽象装备类
 *
 * @author jihongyuan
 * @date 2022/4/14 10:48
 */
@Data
public abstract class AbstractEquip {

    /**
     * 装备类型
     */
    private EquipType equipType;

    /**
     * 装备名称
     */
    private String name;

    /**
     * 装备描述
     */
    private String desc;

    /**
     * 装备属性
     */
    private EquipAttribute equipAttribute;

    /**
     * 装备等级
     */
    private Integer equipLevel;

    /**
     * 装备经验
     */
    private Integer equipExp;

    /**
     * 装备品质
     */
    private Integer equipQuality;

    /**
     * 装备类型
     */
    @AllArgsConstructor
    public enum EquipType {
        NONE(-1, ""),

        HEAD(1, "头盔"),

        BODY(2, "衣服"),

        LEG(3, "护腿"),

        SHOES(4, "鞋子"),

        BRACELET(5, "护腕"),

        WEAPON1(6, "武器1"),

        WEAPON2(6, "武器2"),
        ;

        @Getter
        private final Integer type;

        @Getter
        private final String desc;

        public static EquipType getType(Integer type) {
            for (EquipType equipType : EquipType.values()) {
                if (equipType.getType().equals(type)) {
                    return equipType;
                }
            }
            return NONE;
        }
    }

    /**
     * 装备等级类型
     */
    @AllArgsConstructor
    public enum EquipLevelType {
        NONE(-1, ""),
        LEVEL1(1, "☆"),
        LEVEL2(2, "☆☆"),
        LEVEL3(3, "☆☆☆"),
        LEVEL4(4, "☆☆☆☆"),
        LEVEL5(5, "☆☆☆☆☆"),
        LEVEL6(6, "☆☆☆☆☆☆"),
        ;
        @Getter
        private final Integer type;

        @Getter
        private final String desc;

        public static EquipLevelType getType(Integer type) {
            for (EquipLevelType equipLevelType : EquipLevelType.values()) {
                if (equipLevelType.getType().equals(type)) {
                    return equipLevelType;
                }
            }
            return NONE;
        }
    }

    /**
     * 装备品质类型
     */
    @AllArgsConstructor
    enum EquipQualityType {
        NONE(-1, ""),
        WHITE(1, "白色"),
        GREEN(2, "绿色"),
        BLUE(3, "蓝色"),
        PURPLE(4, "紫色"),
        ORANGE(5, "橙色"),
        ;
        @Getter
        private final Integer type;

        @Getter
        private final String desc;

        public static EquipQualityType getType(Integer type) {
            for (EquipQualityType equipQualityType : EquipQualityType.values()) {
                if (equipQualityType.getType().equals(type)) {
                    return equipQualityType;
                }
            }
            return NONE;
        }
    }
}
