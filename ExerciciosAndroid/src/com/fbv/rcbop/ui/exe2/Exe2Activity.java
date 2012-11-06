package com.fbv.rcbop.ui.exe2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.fbv.rcbop.R;

public class Exe2Activity extends Activity implements OnClickListener{
	
	public static final int REQUEST_CAMERA = 123;
	public static final int REQUEST_CONTACT = 124;
	
	private Button itButton1;
	private Button itButton2;
	private Button itButton3;
	private Button itButton4;
	private Button itButton5;
	private Button itButton6;
	private Button itButton7;
	private Button itButton8;
	private Button itButton9;
	private Button itButton10;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exe2_layout);
		
		itButton1 = (Button) findViewById(R.id.btnIntent1);
		itButton1.setOnClickListener(this);
		itButton2 = (Button) findViewById(R.id.btnIntent2);
		itButton2.setOnClickListener(this);
		itButton3 = (Button) findViewById(R.id.btnIntent3);
		itButton3.setOnClickListener(this);
		itButton4 = (Button) findViewById(R.id.btnIntent4);
		itButton4.setOnClickListener(this);
		itButton5 = (Button) findViewById(R.id.btnIntent5);
		itButton5.setOnClickListener(this);
		itButton6 = (Button) findViewById(R.id.btnIntent6);
		itButton6.setOnClickListener(this);
		itButton7 = (Button) findViewById(R.id.btnIntent7);
		itButton7.setOnClickListener(this);
		itButton8 = (Button) findViewById(R.id.btnIntent8);
		itButton8.setOnClickListener(this);
		itButton9 = (Button) findViewById(R.id.btnIntent9);
		itButton9.setOnClickListener(this);
		itButton10 = (Button) findViewById(R.id.btnIntent10);
		itButton10.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		Intent it = null;
		Uri uri = null;

		switch (v.getId()) {
		case R.id.btnIntent1:
			uri = Uri.parse("http://www.fbv.br");
			it = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(it);
			break;
		//ABRE APLICACAO DE CONTATOS
		case R.id.btnIntent2:
				uri = Uri.parse("content://contacts/people/");
			if (uri != null) {
				it = new Intent(Intent.ACTION_PICK, uri);
				startActivityForResult(it, 0);
			}
			else {
				Toast toast = Toast.makeText(this, "Cadastre Pelo menos um contato!", Toast.LENGTH_SHORT);
				toast.show();
			}
			break;
		//PRIMEIRO CONTATO DA AGENDA
		case R.id.btnIntent3:
			uri = Uri.parse("content://contacts/people/1");
			if (uri != null) {
				it = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(it);
			}
			else {
				Toast toast = Toast.makeText(this, "Não há contatos cadastrados", Toast.LENGTH_LONG);
				toast.show();
			}
			break;
		case R.id.btnIntent4:
			uri = Uri.parse("tel:88436804");
			it = new Intent(Intent.ACTION_DIAL, uri);
			startActivity(it);
			break;
		case R.id.btnIntent5:
			uri = Uri.parse("sms:88436804");
			it = new Intent(Intent.ACTION_VIEW, uri);
			it.putExtra("sms_txt", "TESTE DE SMS");
			startActivity(it);
			break;
		case R.id.btnIntent6:
			uri = Uri.parse("geo:0,0?q=Rua+General+Artur+Oscar+N30,Recife");
			it = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(it);
			break;
		case R.id.btnIntent7:
			it = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(it, REQUEST_CAMERA);
			break;
		case R.id.btnIntent8:
			it = new Intent(this, ActivityIntent.class);
			startActivity(it);
			break;
		case R.id.btnIntent9:
			it = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
			startActivity(it);
			break;
		case R.id.btnIntent10:
			it = new Intent("ROGER_BROADCAST");
			it.putExtra("item", 666);
			sendBroadcast(it);
			break;
		}
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		if (requestCode == REQUEST_CAMERA) {

		}
		else if (requestCode == REQUEST_CONTACT){
			if (data == null) {
				Toast toast = Toast.makeText(this, "Nenhum Contato", Toast.LENGTH_SHORT);
				toast.show();
			}else {
				Uri uri = data.getData();
				Toast toast = Toast.makeText(this, "Contato: "+uri, Toast.LENGTH_SHORT);
				toast.show();
			}
		}
		
	}
}
