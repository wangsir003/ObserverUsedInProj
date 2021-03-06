package com.example.wangsir.observerusedinproj.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.wangsir.observerusedinproj.R;
import com.example.wangsir.observerusedinproj.observer.ConcreatorSubject;
import com.example.wangsir.observerusedinproj.observer.Observer;

/**
 * Created by WangSir on 2017/11/14.
 */

public class FivethFragment extends Fragment implements Observer{
    private static final String TAG = "FivethFragment";
    private View mView;
    private LinearLayout mContainer;

    @Override
    public void onAttach(Context context) {
        Log.e(TAG, "onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Log.e(TAG, "onCreateView");
        mView = inflater.inflate(R.layout.fragment_text5, container, false);
        mContainer = (LinearLayout) mView.findViewById(R.id.container5);
        ConcreatorSubject instance = ConcreatorSubject.getInstance();
        instance.addObserver(this);
        return mView;
    }

    @Override
    public void update(String color) {
        if (color  == null){
            Log.e(TAG,"color空");
        }else{
            Log.e(TAG,"color" + color);

        }
        mContainer.setBackgroundColor(Color.parseColor(color));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onStart() {
        Log.e(TAG, "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e(TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(TAG, "onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e(TAG, "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e(TAG, "onDetach");
        super.onDetach();
    }

    @Override
    public boolean getUserVisibleHint() {
        Log.e(TAG, "getUserVisibleHint");
        return super.getUserVisibleHint();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.e(TAG, "setUserVisibleHint:" + isVisibleToUser);
    }


}