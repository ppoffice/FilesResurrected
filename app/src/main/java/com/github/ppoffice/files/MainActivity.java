package com.github.ppoffice.files;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    finish();

    Intent intent = new Intent(Intent.ACTION_MAIN);
    intent.setComponent(new ComponentName("com.google.android.documentsui", "com.android.documentsui.files.FilesActivity"));
    startActivity(intent);
  }
}