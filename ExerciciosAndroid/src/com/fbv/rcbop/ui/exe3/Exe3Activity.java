package com.fbv.rcbop.ui.exe3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.fbv.rcbop.R;

public class Exe3Activity extends Activity implements OnClickListener{
	
	WebView mWebView;
	EditText edtText;
	Button btnGo;
	MyWebViewClient myWebViewClient;
	LinearLayout ll;
	private final int SAIR = 1337;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exe3_layout);
		
		btnGo = (Button) findViewById(R.id.btnGoGo);
		
		edtText = (EditText) findViewById(R.id.editTextBrowser);
		mWebView = (WebView) findViewById(R.id.browserWebView);
	    
		myWebViewClient = new MyWebViewClient();
		
		mWebView.setWebViewClient(myWebViewClient);
		
		ll = (LinearLayout) findViewById(R.id.linearBrowser);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		btnGo.setOnClickListener(this);
		mWebView.getSettings().setJavaScriptEnabled(true);
	}
	
	@Override
	public boolean onMenuOpened(int featureId, Menu menu) {
		ll.setVisibility(View.VISIBLE);
		return super.onMenuOpened(featureId, menu);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, SAIR, 0, "Sair");
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		if (item.getItemId() == SAIR) {
			this.finish();
		}
		return super.onMenuItemSelected(featureId, item);
	}
	
	@Override
	public void onClick(View v) {
			if (v.getId() == R.id.btnGoGo) {
				String url = edtText.getText().toString();
				if (url.substring(0, 3).equals("www")) {
					url = "http://"+ url;
				}
				ll.setVisibility(View.GONE);
				mWebView.loadUrl(url);
				myWebViewClient.onLoadResource(mWebView, url);
			}
	}
}

