package com.dk.clone;

/**
 * @author DingKai
 * @Classname CommonClone
 * @Description review: Java shallow clone
 * @create 2019/4/17
 */
public class CommonClone implements Cloneable{

    private String name = "clone";

    private int age = 20;

    public Long cardId = 1234567890L;

    public CloneObj cloneObj;

    public CommonClone(CloneObj cloneObj) {
        this.cloneObj = cloneObj;
    }

    public CloneObj getCloneObj() {
        return cloneObj;
    }

    public void setCloneObj(CloneObj cloneObj) {
        this.cloneObj = cloneObj;
    }

    @Override
    public String toString() {
        return "name:" + name + " age:" + age + " cardId:" + cardId + " cloneObj:{\"stringTest\":\"" + this.cloneObj.
                stringTest + "\",\"anIntTest\":\"" + this.cloneObj.anIntTest + "\"}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
