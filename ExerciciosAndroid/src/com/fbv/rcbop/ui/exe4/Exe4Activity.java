package com.fbv.rcbop.ui.exe4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import com.fbv.rcbop.R;

public class Exe4Activity extends Activity implements OnItemClickListener {
	GalleryAdapter ga;
	private Gallery gallery;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exe4_layout);
		ga = new GalleryAdapter(this);
		gallery = (Gallery) findViewById(R.id.galleryMaldita);
		gallery.setAdapter(ga);
		gallery.setOnItemClickListener(this);
	}

	@SuppressWarnings("rawtypes")
	public void onItemClick(AdapterView parent, View v, int position, long id) {

		Integer imagem = ga.getImagem(position);
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.image_toast,
				(ViewGroup) findViewById(R.id.toast));

		ImageView image = (ImageView) layout.findViewById(R.id.toastGallery);
		image.setImageResource(imagem);

		Toast toast = new Toast(getApplicationContext());
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(layout);
		toast.show();

	}
}
