package com.myimooc.mydatalog.domain;

/**
 * @title 操作类型枚举类
 * @describe 枚举操作类型
 * @author zc
 * @version 1.0 2017-09-13
 */
public enum ActionType {

    INSERT("添加", 1),

    UPDATE("更新", 2),

    DELETE("删除", 3);

    private String name;

    private int index;

    ActionType(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (ActionType actionType : ActionType.values()) {
            if (actionType.getIndex() == index) {
                return actionType.name;
            }
        }
        return null;
    }

    public static Integer getIndex(String name) {
        for (ActionType actionType : ActionType.values()) {
            if (actionType.getName().equals(name)) {
                return actionType.index;
            }
        }
        return null;
    }

    public static ActionType getActionType(int index) {
        for (ActionType actionType : ActionType.values()) {
            if (actionType.getIndex() == index) {
                return actionType;
            }
        }
        return null;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}
