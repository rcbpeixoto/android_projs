package com.fbv.rcbop.ui.exe4;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import com.fbv.rcbop.R;

public class GalleryAdapter extends BaseAdapter {
	
	private Integer[] imagens = {
			R.drawable.sport_escudo,
			R.drawable.nautico_escudo,
			R.drawable.santa_escudo,};
	private Context ctx;
	int itemGallery;

	public GalleryAdapter(Context ctx) {
		this.ctx = ctx;
		TypedArray attr = ctx.obtainStyledAttributes(R.styleable.GalleryDoMal);
		itemGallery = attr.getResourceId(R.styleable.GalleryDoMal_android_galleryItemBackground, 0);
		attr.recycle();
	}
	
	public Integer getImagem(int pos){
		return imagens[pos];
	}

	@Override
	public int getCount() {
		return imagens.length;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ImageView imageView = new ImageView(ctx);

		imageView.setImageResource(imagens[position]);
		imageView.setLayoutParams(new Gallery.LayoutParams(150, 100));
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setBackgroundResource(itemGallery);

		return imageView;
	}

}
