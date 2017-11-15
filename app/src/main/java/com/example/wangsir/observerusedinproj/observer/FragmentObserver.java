package com.example.wangsir.observerusedinproj.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by WangSir on 2017/11/14.
 */

public interface FragmentObserver implements Observer {

    void update(String name);
}
