package com.glapps.mobile.japasseiencceja.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Preferencias {
    private final int MODE = 0;
    private final String NOME_ARQUIVO = "essa.preferencias";
    private final static String KEY_MEDIA_GERAL = "MEDIA_GERAL";
    private Editor editor;
    private SharedPreferences preferences;
    private Context contexto;
    ArrayList<String> savedArray = new ArrayList<>();
    Set<String> gandula = new HashSet<>();
    public Preferencias(Context contextoParametro) {
        contexto = contextoParametro;
        preferences = contexto.getSharedPreferences(NOME_ARQUIVO, MODE);
        editor = preferences.edit();
        gandula.add("0");
    }

    public void setCurrentCorrectChoose(String currentCorrectChoose) {
        //Log.i("Preferencias", "setCurrentCorrectChoose(" + String.valueOf(currentCorrectChoose) + ")");
        this.editor.putString("CurrentCorrectChoose", currentCorrectChoose);
        this.editor.commit();
    }

   public void addMediaGeral(double mediaGeral, String formatacao) {
       Gson gson = new Gson();
       ArrayList<String> arrayList = getMediaGeral();
       if (arrayList == null){
           arrayList = new ArrayList<>();
       }

       arrayList.add(String.format(formatacao,mediaGeral));
       String json = gson.toJson(arrayList);
        //Log.i("RETORNANDO", "Set: "+json);

       editor.putString(KEY_MEDIA_GERAL, json);
       editor.commit();

    }

    public ArrayList<String> getMediaGeral(){
        Gson gson = new Gson();
        String json = preferences.getString(KEY_MEDIA_GERAL, null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        ArrayList<String> arrayList = gson.fromJson(json, type);
       // if (arrayList == null) //Log.i("RETORNANDO", "ARRAY LIST NULO");
        return arrayList;
    }


    public String getCurrentCorrectChoose() {
        return this.preferences.getString("CurrentCorrectChoose", "NULO");
    }

}
