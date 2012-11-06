package com.fbv.rcbop.ui.exe5;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;

import com.fbv.rcbop.R;


public class Exe5Activity extends Activity implements OnLongClickListener {
	TextView txtView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exe5_layout);
		txtView = (TextView) findViewById(R.id.textID);
	}
	
	@Override
	protected void onStart() {
		txtView.setOnLongClickListener(this);
		super.onStart();
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		for (int i = 1; i <= 15; i++) {
			menu.add(0, i, i, "Opção "+i);
		}
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		Intent it = new Intent("ROGER_BROADCAST");
		switch (item.getItemId()) {
		case 1:
			it.putExtra("item", 1);
			sendBroadcast(it);
			break;
		case 2:
			it.putExtra("item", 2);
			sendBroadcast(it);
			break;
		case 3:
			it.putExtra("item", 3);
			sendBroadcast(it);
			break;
		case 4:
			it.putExtra("item", 4);
			sendBroadcast(it);
			break;
		case 5:
			it.putExtra("item", 5);
			sendBroadcast(it);
			break;
		case 6:
			it.putExtra("item", 6);
			sendBroadcast(it);
			break;
		case 7:
			it.putExtra("item", 7);
			sendBroadcast(it);
			break;
		case 8:
			it.putExtra("item", 8);
			sendBroadcast(it);
			break;
		case 9:
			it.putExtra("item", 9);
			sendBroadcast(it);
			break;
		case 10:
			it.putExtra("item", 10);
			sendBroadcast(it);
			break;
		case 11:
			it.putExtra("item", 11);
			sendBroadcast(it);
			break;
		case 12:
			it.putExtra("item", 12);
			sendBroadcast(it);
			break;
		case 13:
			it.putExtra("item", 13);
			sendBroadcast(it);
			break;
		case 14:
			it.putExtra("item", 14);
			sendBroadcast(it);
			break;
		case 15:
			it.putExtra("item", 15);
			sendBroadcast(it);
			break;
		}
		return super.onContextItemSelected(item);
	}

	@Override
	public boolean onLongClick(View v) {
		if (v.getId() == R.id.textID) {
			registerForContextMenu(v);
		}
		return false;
	}


}
