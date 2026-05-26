package UD9;

import java.time.LocalDate;

public class Member {
    String name,photofilepath;
    int Byear;

    public Member(String name,int Byear,String photofilepath) {
        this.name = name;
        this.Byear = Byear;
        this.photofilepath = photofilepath;
    }

    public Member(String name,int Byear) {
        this.name = name;
        this.Byear = Byear;
    }

    public int age(){
        return LocalDate.now().getYear() - this.Byear;
    }
}
