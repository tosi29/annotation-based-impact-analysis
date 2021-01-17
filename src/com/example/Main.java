package com.example;

import com.example.annotation.Progress;
import com.example.annotation.ProjectA;
import com.example.annotation.ProjectB;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().method());
        System.out.println(new Main().method2());
        return ;
    }

    @ProjectA("要修正。hogeをfugaに変更すればよい？")
    public String method() {
        return "hoge";
    }

    @ProjectB(value = "要修正。hogeをfugaに変更すればよい？", progress = Progress.NEED_TO_FIX)
    public String method2() {
        return "hoge";
    }

}
