package com.dk.feature.inherit.issue;

import com.dk.feature.inherit.issue.obj.Elephant;

/**
 * @author DingKai
 * @Classname inheritProblem
 * @Description Subclass inherit Base Class all of attribute or method
 *              then use reflect method to modify base class
 * @date 2019/4/30
 */
public class InheritProblem {
    public static void main(String[] args){
        Elephant elephant = new Elephant("大象");
        elephant.elephantSet(4, "香蕉", 2000, 20);
        elephant.display();
    }
}
