package com.example.myapplication.fragment;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.view.TitleBarView;

public class SettingFragment extends Fragment {

	private Context mContext;
	private View mBaseView;
	private TitleBarView mTitleBarView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mContext=getActivity();
//		mBaseView=inflater.inflate(R.layout.fragment_mine, null);
		mBaseView=inflater.inflate(R.layout.fragment_mine, null);
		findView();
		init();
		return mBaseView;
	}
	
	private void findView(){
//		mTitleBarView=(TitleBarView) mBaseView.findViewById(R.id.title_bar);
	}
	
	private void init(){
//		mTitleBarView.setCommonTitle(View.GONE, View.VISIBLE, View.GONE, View.GONE);
//		mTitleBarView.setTitleText(R.string.mime);
	}

}
