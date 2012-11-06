package com.fbv.rcbop.ui.exe5;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.fbv.rcbop.R;

public class Exe5BCR extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		int item = intent.getExtras().getInt("item");
//		Toast.makeText(context, "Sou um BroadCastReceiver\nQuem me acionou foi a opção "+item, Toast.LENGTH_LONG).show();
		criarNotificacao(context, "Opção "+item, "action: ROGER_BROADCAST", "Sou uma Notificação "+item, intent);
	}
	
	public void criarNotificacao(Context context, String  barra, String titulo, String mensagem, Intent intent){
		int item = intent.getExtras().getInt("item");
		
		PendingIntent pit = PendingIntent.getActivity(context, 0, new Intent(),0);
		Notification notificao = new Notification(R.drawable.icon, "Opção "+ item + " selecionada", System.currentTimeMillis());
		notificao.setLatestEventInfo(context, titulo, mensagem, pit);
		
		NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		
		notificao.vibrate = new long[] { 100, 50, 100, 50 };
		
		manager.notify(500, notificao);
	}

}
