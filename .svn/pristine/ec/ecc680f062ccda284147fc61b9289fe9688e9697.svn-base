package org.android;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GameListAdapter extends ArrayAdapter<AvailableGame> {

	private Context mContext;
	private List<AvailableGame> gameList;
	private int resourceId;

	public GameListAdapter(Context context, int resource, List<AvailableGame> objects) {
		super(context, resource, objects);
		mContext = context;
		gameList = objects;
		resourceId = resource;
	}

	@Override
	public AvailableGame getItem(int position) {
		return gameList.get(position);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
			convertView = inflater.inflate(resourceId, parent, false);
		}
		TextView gameName = (TextView) convertView.findViewById(R.id.gameName);
		gameName.setText(getItem(position).getAppLabel());
		return convertView;
	}

}
