package com.fbv.rcbop.ui.exe1;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;

import com.fbv.rcbop.R;

/**
 * @author Rogerio
 *
 */
public class Exe1Activity extends TabActivity implements OnClickListener{
	
	// ------ ABAS ------
	TabHost tabHost;
	TabSpec aba1;
	TabSpec aba2;
	TabSpec aba3;
	TabSpec aba4;
	
	//-------- LINHA 1 ----------
	View qd11;
	View qd12;
	View qd13;
	View qd14;
	View qd15;
	View qd16;
	View qd17;
	View qd18;
	//-------- LINHA 2 ----------
	View qd21;
	View qd22;
	View qd23;
	View qd24;
	View qd25;
	View qd26;
	View qd27;
	View qd28;
	//-------- LINHA 3 ----------
	View qd31;
	View qd32;
	View qd33;
	View qd34;
	View qd35;
	View qd36;
	View qd37;
	View qd38;
	//-------- LINHA 4 ----------
	View qd41;
	View qd42;
	View qd43;
	View qd44;
	View qd45;
	View qd46;
	View qd47;
	View qd48;
	//-------- LINHA 5 ----------
	View qd51;
	View qd52;
	View qd53;
	View qd54;
	View qd55;
	View qd56;
	View qd57;
	View qd58;
	//-------- LINHA 6 ----------
	View qd61;
	View qd62;
	View qd63;
	View qd64;
	View qd65;
	View qd66;
	View qd67;
	View qd68;
	//-------- LINHA 7 ----------
	View qd71;
	View qd72;
	View qd73;
	View qd74;
	View qd75;
	View qd76;
	View qd77;
	View qd78;
	//-------- LINHA 8 ----------
	View qd81;
	View qd82;
	View qd83;
	View qd84;
	View qd85;
	View qd86;
	View qd87;
	View qd88;
	
	//------- BTNS LINKS -----------
	
	TextView txtGoogle;
	TextView txtUol;
	TextView txtSubmarino;
	TextView txtGlobo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// PREPARANDO TAB HOST
		
		tabHost = getTabHost();
		LayoutInflater.from(this).inflate(R.layout.exe1_layout_1, tabHost.getTabContentView());
        LayoutInflater.from(this).inflate(R.layout.exe1_layout_2, tabHost.getTabContentView());
        LayoutInflater.from(this).inflate(R.layout.exe1_layout_3, tabHost.getTabContentView());
        LayoutInflater.from(this).inflate(R.layout.exe1_layout_4, tabHost.getTabContentView());
        
        aba1 = tabHost.newTabSpec("aba1");
        aba1.setIndicator("Exe a)");
        aba1.setContent(R.id.rootExe1a);
        
        aba2 = tabHost.newTabSpec("aba2");
        aba2.setIndicator("Exe b)");
        aba2.setContent(R.id.rootExe1b);
        
        aba3 = tabHost.newTabSpec("aba3");
        aba3.setIndicator("Exe c)");
        aba3.setContent(R.id.rootExe1c);
        
        aba4 = tabHost.newTabSpec("aba4");
        aba4.setIndicator("Exe d)");
        aba4.setContent(R.id.rootExe1d);
        tabHost.addTab(aba1);
        tabHost.addTab(aba2);
		tabHost.addTab(aba3);
		tabHost.addTab(aba4);
		
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		// INSTANCIANDO VIEWS E SETANDO LISTENERS
		setListeners();
	}
	
	//TRATANDO ABA ABERTA DURANTE CLICK
	@Override
	public void onClick(View v) {

		int currentTab = tabHost.getCurrentTab();

		if (currentTab == 0) {
			onChessClickLine(v);
		}
	}
	
	// TRATANDO EVENDO DE CLIQUE - LINHA
	private void onChessClickLine(View v) {
		
		int line = 0;
		View parent = (View) v.getParent();

		switch (parent.getId()) {
		case R.id.linha1:
			line = 1;
			onChessClickColumn(v, line);
			break;
		case R.id.linha2:
			line = 2;
			onChessClickColumn(v, line);
			break;
		case R.id.linha3:
			line = 3;
			onChessClickColumn(v, line);
			break;
		case R.id.linha4:
			line = 4;
			onChessClickColumn(v, line);
			break;
		case R.id.linha5:
			line = 5;
			onChessClickColumn(v, line);
			break;
		case R.id.linha6:
			line = 6;
			onChessClickColumn(v, line);
			break;
		case R.id.linha7:
			line = 7;
			onChessClickColumn(v, line);
			break;
		case R.id.linha8:
			line = 8;
			onChessClickColumn(v, line);
			break;
		}
	}
	
	// TRATANDO EVENTO DE LINHA - COLUNA
	private void onChessClickColumn(View v, int line) {
		int leftPx = v.getLeft();
		int column = 0;
		
		switch (leftPx) {
		case 0:
			column = 1;
			break;
		case 40:
			column = 2;
			break;
		case 80:
			column = 3;
			break;
		case 120:
			column = 4;
			break;
		case 160:
			column = 5;
			break;
		case 200:
			column = 6;
			break;
		case 240:
			column = 7;
			break;
		case 280:
			column = 8;
			break;
		}
		
		Toast toast = Toast.makeText(this, "Linha: "+line + " Coluna: "+column, Toast.LENGTH_SHORT);
		toast.show();
	}
	
	/**
	 * ESSE MÉTODO EU PARTICULARMENTE ACHO MUITO LINDO
	 * COLORE A TELA DO PC
	 * 
	 * @param l
	 */
	public void setListeners(){
		
		//BTNS LINKS
//		btnGlobo = (Button) findViewById(R.id.globoLink);
//		btnGlobo.setOnClickListener(this);
//		btnGoogle = (Button) findViewById(R.id.googleLink);
//		btnGoogle.setOnClickListener(this);
//		btnSubmarino = (Button) findViewById(R.id.submarinoLink);
//		btnSubmarino.setOnClickListener(this);
//		btnUol = (Button) findViewById(R.id.uolLink);
//		btnUol.setOnClickListener(this);
		
		//LINHA 1
		qd11 = findViewById(R.id.qd11);
		qd11.setOnClickListener(this);
		qd12 = findViewById(R.id.qd12);
		qd12.setOnClickListener(this);
		qd13 = findViewById(R.id.qd13);
		qd13.setOnClickListener(this);
		qd14 = findViewById(R.id.qd14);
		qd14.setOnClickListener(this);
		qd15 = findViewById(R.id.qd15);
		qd15.setOnClickListener(this);
		qd16 = findViewById(R.id.qd16);
		qd16.setOnClickListener(this);
		qd17 = findViewById(R.id.qd17);
		qd17.setOnClickListener(this);
		qd18 = findViewById(R.id.qd18);
		qd18.setOnClickListener(this);
		
		//LINHA 2
		qd21 = findViewById(R.id.qd21);
		qd21.setOnClickListener(this);
		qd22 = findViewById(R.id.qd22);
		qd22.setOnClickListener(this);
		qd23 = findViewById(R.id.qd23);
		qd23.setOnClickListener(this);
		qd24 = findViewById(R.id.qd24);
		qd24.setOnClickListener(this);
		qd25 = findViewById(R.id.qd25);
		qd25.setOnClickListener(this);
		qd26 = findViewById(R.id.qd26);
		qd26.setOnClickListener(this);
		qd27 = findViewById(R.id.qd27);
		qd27.setOnClickListener(this);
		qd28 = findViewById(R.id.qd28);
		qd28.setOnClickListener(this);
		
		//LINHA 3
		qd31 = findViewById(R.id.qd31);
		qd31.setOnClickListener(this);
		qd32 = findViewById(R.id.qd32);
		qd32.setOnClickListener(this);
		qd33 = findViewById(R.id.qd33);
		qd33.setOnClickListener(this);
		qd34 = findViewById(R.id.qd34);
		qd34.setOnClickListener(this);
		qd35 = findViewById(R.id.qd35);
		qd35.setOnClickListener(this);
		qd36 = findViewById(R.id.qd36);
		qd36.setOnClickListener(this);
		qd37 = findViewById(R.id.qd37);
		qd37.setOnClickListener(this);
		qd38 = findViewById(R.id.qd38);
		qd38.setOnClickListener(this);
		
		//LINHA 4
		qd41 = findViewById(R.id.qd41);
		qd41.setOnClickListener(this);
		qd42 = findViewById(R.id.qd42);
		qd42.setOnClickListener(this);
		qd43 = findViewById(R.id.qd43);
		qd43.setOnClickListener(this);
		qd44 = findViewById(R.id.qd44);
		qd44.setOnClickListener(this);
		qd45 = findViewById(R.id.qd45);
		qd45.setOnClickListener(this);
		qd46 = findViewById(R.id.qd46);
		qd46.setOnClickListener(this);
		qd47 = findViewById(R.id.qd47);
		qd47.setOnClickListener(this);
		qd48 = findViewById(R.id.qd48);
		qd48.setOnClickListener(this);
		
		//LINHA 5
		qd51 = findViewById(R.id.qd51);
		qd51.setOnClickListener(this);
		qd52 = findViewById(R.id.qd52);
		qd52.setOnClickListener(this);
		qd53 = findViewById(R.id.qd53);
		qd53.setOnClickListener(this);
		qd54 = findViewById(R.id.qd54);
		qd54.setOnClickListener(this);
		qd55 = findViewById(R.id.qd55);
		qd55.setOnClickListener(this);
		qd56 = findViewById(R.id.qd56);
		qd56.setOnClickListener(this);
		qd57 = findViewById(R.id.qd57);
		qd57.setOnClickListener(this);
		qd58 = findViewById(R.id.qd58);
		qd58.setOnClickListener(this);
		
		//LINHA 6
		qd61 = findViewById(R.id.qd61);
		qd61.setOnClickListener(this);
		qd62 = findViewById(R.id.qd62);
		qd62.setOnClickListener(this);
		qd63 = findViewById(R.id.qd63);
		qd63.setOnClickListener(this);
		qd64 = findViewById(R.id.qd64);
		qd64.setOnClickListener(this);
		qd65 = findViewById(R.id.qd65);
		qd65.setOnClickListener(this);
		qd66 = findViewById(R.id.qd66);
		qd66.setOnClickListener(this);
		qd67 = findViewById(R.id.qd67);
		qd67.setOnClickListener(this);
		qd68 = findViewById(R.id.qd68);
		qd68.setOnClickListener(this);
		
		//LINHA 7
		qd71 = findViewById(R.id.qd71);
		qd71.setOnClickListener(this);
		qd72 = findViewById(R.id.qd72);
		qd72.setOnClickListener(this);
		qd73 = findViewById(R.id.qd73);
		qd73.setOnClickListener(this);
		qd74 = findViewById(R.id.qd74);
		qd74.setOnClickListener(this);
		qd75 = findViewById(R.id.qd75);
		qd75.setOnClickListener(this);
		qd76 = findViewById(R.id.qd76);
		qd76.setOnClickListener(this);
		qd77 = findViewById(R.id.qd77);
		qd77.setOnClickListener(this);
		qd78 = findViewById(R.id.qd78);
		qd78.setOnClickListener(this);
		
		//LINHA 8
		qd81 = findViewById(R.id.qd81);
		qd81.setOnClickListener(this);
		qd82 = findViewById(R.id.qd82);
		qd82.setOnClickListener(this);
		qd83 = findViewById(R.id.qd83);
		qd83.setOnClickListener(this);
		qd84 = findViewById(R.id.qd84);
		qd84.setOnClickListener(this);
		qd85 = findViewById(R.id.qd85);
		qd85.setOnClickListener(this);
		qd86 = findViewById(R.id.qd86);
		qd86.setOnClickListener(this);
		qd87 = findViewById(R.id.qd87);
		qd87.setOnClickListener(this);
		qd88 = findViewById(R.id.qd88);
		qd88.setOnClickListener(this);
	}
}
