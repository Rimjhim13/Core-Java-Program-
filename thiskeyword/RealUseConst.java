package com.allexample.thiskeyword;

public class RealUseConst {
    String name;
    int rollNo;
    String course;
    float fees;
    RealUseConst(String name,int rollNo,String course){
        this.name=name;
        this.rollNo=rollNo;
        this.course=course;
    }
    RealUseConst(String name,int rollNo,String course,float fees){
        this(name,rollNo,course);
        this.fees=fees;

    }

    @Override
    public String toString() {
        return "name="+name+" "+"rollNo="+rollNo+" "+"course="+course+" "+"fees="+fees;
    }
}
