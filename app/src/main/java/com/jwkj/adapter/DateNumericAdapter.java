package com.jwkj.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amenuo.yoosee.R;
import com.jwkj.wheel.widget.AbstractWheelAdapter;

public class DateNumericAdapter extends AbstractWheelAdapter {
	Context context;
	int start;
	int end;

	public DateNumericAdapter(Context context, int start, int end) {
		this.context = context;
		this.start = start;
		this.end = end;
	}

	@Override
	public int getItemsCount() {
		// TODO Auto-generated method stub
		return end - start + 1;
	}

	@Override
	public View getItem(int index, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view = convertView;
		if (view == null) {
			view = LayoutInflater.from(context).inflate(
					R.layout.list_wheel_date_item, null);
		}
		TextView text = (TextView) view.findViewById(R.id.text);
		text.setText(String.valueOf((start + index)));
		return view;
	}

}
