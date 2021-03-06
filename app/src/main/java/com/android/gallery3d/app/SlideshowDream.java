package com.android.gallery3d.app;

import android.content.Intent;
import android.os.Bundle;

import com.android.gallery3d.BasicDream;



public class SlideshowDream extends BasicDream {
    @Override
    public void onCreate(Bundle bndl) {
        super.onCreate(bndl);
        Intent i = new Intent(
            Intent.ACTION_VIEW,
            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
//            Uri.fromFile(Environment.getExternalStoragePublicDirectory(
//                        Environment.DIRECTORY_PICTURES)))
                .putExtra(Gallery.EXTRA_SLIDESHOW, true)
                .setFlags(getIntent().getFlags());
        startActivity(i);
        finish();
    }
}
