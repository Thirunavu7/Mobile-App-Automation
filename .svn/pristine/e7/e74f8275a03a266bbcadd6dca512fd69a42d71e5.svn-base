package org.android;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HelloAndroidActivity extends Activity {
	
	private final static String TAG = "HelloAndroidActivity";

	//@InjectView(R.id.gameList) // Not working needs fix
	private ListView mGameList;
	private Logger logger;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findAllViews();
		logger = Logger.getLogger(TAG);
		PackageManager packageManager = getPackageManager();
		Intent intent = new Intent(Intent.ACTION_MAIN, null);
		intent.addCategory("com.teamsuccesso.game.plugin");
		List<ResolveInfo> availableActivities = packageManager.queryIntentActivities(intent, 0);
		List<AvailableGame> games = new ArrayList<>();
		for(ResolveInfo activity : availableActivities){
			ActivityInfo info = activity.activityInfo;
			games.add(new AvailableGame((String) activity.loadLabel(packageManager), info.applicationInfo.packageName, info.name));
		}
		ArrayAdapter<AvailableGame> adapter = new GameListAdapter(HelloAndroidActivity.this, R.layout.gamelistview, games);
		mGameList.setAdapter(adapter);
		mGameList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
				AvailableGame game = (AvailableGame) mGameList.getAdapter().getItem(position);
				ComponentName name = new ComponentName(game.getPackageName(), game.getAppName());
				Intent startIntent = new Intent(Intent.ACTION_MAIN);
				startIntent.addCategory("com.teamsuccesso.game.plugin");
				startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
				startIntent.setComponent(name);
//				Intent startIntent = new Intent();
//				startIntent.setClassName(game.getPackageName(), game.getAppName());
				startActivity(startIntent);
			}
		});
 	}

	
	private void findAllViews() {
		mGameList = (ListView) findViewById(R.id.gameList);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
