package com.dk.basis.feature.inherit.issue;

import com.dk.basis.feature.inherit.issue.obj.Elephant;

/**
 * Subclass inherit Base Class all of attribute or method
 * then use reflect method to modify base class
 * @author DingKai
 * @version 1.0
 */
public class InheritProblem {
    public static void main(String[] args){
        Elephant elephant = new Elephant("大象");
        elephant.elephantSet(4, "香蕉", 2000, 20);
        elephant.display();
    }
}
