package com.fbv.rcbop.ui;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.fbv.rcbop.R;
import com.fbv.rcbop.model.Exercicio;
import com.fbv.rcbop.ui.exe1.Exe1Activity;
import com.fbv.rcbop.ui.exe2.Exe2Activity;
import com.fbv.rcbop.ui.exe3.Exe3Activity;
import com.fbv.rcbop.ui.exe4.Exe4Activity;
import com.fbv.rcbop.ui.exe5.Exe5Activity;

public class MenuActivity extends Activity {

	private LinkedList<Exercicio> listExe;

	private static final int QUESTAO1 = 1;
	private static final int QUESTAO2 = 2;
	private static final int QUESTAO3 = 3;
	private static final int QUESTAO4 = 4;
	private static final int QUESTAO5 = 5;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		listExe = new LinkedList<Exercicio>();

		listExe.add(new Exercicio(QUESTAO1, "Questão 1"));
		listExe.add(new Exercicio(QUESTAO2, "Questão 2"));
		listExe.add(new Exercicio(QUESTAO3, "Questão 3"));
		listExe.add(new Exercicio(QUESTAO4, "Questão 4"));
		listExe.add(new Exercicio(QUESTAO5, "Questão 5"));

	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, QUESTAO1, 0, "Questão1");
		menu.add(0, QUESTAO2, 1, "Questão2");
		menu.add(0, QUESTAO3, 2, "Questão3");
		menu.add(0, QUESTAO4, 3, "Questão4");
		menu.add(0, QUESTAO5, 4, "Questão5");
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Intent it = null;
		switch (item.getItemId()) {
		case QUESTAO1:
			it = new Intent(this, Exe1Activity.class);
			startActivity(it);
			break;
		case QUESTAO2:
			it = new Intent(this, Exe2Activity.class);
			startActivity(it);
			break;
		case QUESTAO3:
			it = new Intent(this, Exe3Activity.class);
			startActivity(it);
			break;
		case QUESTAO4:
			it = new Intent(this, Exe4Activity.class);
			startActivity(it);
			break;
		case QUESTAO5:
			it = new Intent(this, Exe5Activity.class);
			startActivity(it);
			break;
		}
		return super.onMenuItemSelected(featureId, item);
	}
	
}