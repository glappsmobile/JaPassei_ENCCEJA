package com.glapps.mobile.japasseiencceja.application;

import android.app.Application;

import com.glapps.mobile.japasseiencceja.objects.Imgz;
import com.glapps.mobile.japasseiencceja.objects.Questao;

import java.util.ArrayList;

public class MyApplication extends Application {

    private String[] respostas;
    private int posicao;
    private String materia;
    private String ano;
    private String tipo;
    private Boolean see_results = false;
    private Boolean ver_resposta;
    private ArrayList<Questao> listaDeQuestoes;
    private ArrayList<Imgz> imgzs;
    private boolean finished;
    ArrayList<String> anosGerados = new ArrayList<>();
    ArrayList<String> materiasGeradas = new ArrayList<>();
    ArrayList<Integer> indicesGerados = new ArrayList<>();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getAnosGerados() {
        return anosGerados;
    }

    public void setAnosGerados(ArrayList<String> anosGerados) {
        this.anosGerados = anosGerados;
    }

    public ArrayList<String> getMateriasGeradas() {
        return materiasGeradas;
    }

    public void setMateriasGeradas(ArrayList<String> materiasGeradas) {
        this.materiasGeradas = materiasGeradas;
    }

    public ArrayList<Integer> getIndicesGerados() {
        return indicesGerados;
    }

    public void setIndicesGerados(ArrayList<Integer> indicesGerados) {
        this.indicesGerados = indicesGerados;
    }

    public ArrayList<Imgz> getImgzs() {
        return imgzs;
    }

    public void setImgzs(ArrayList<Imgz> imgzs) {
        this.imgzs = imgzs;
        //Log.i("MyApplication", "------------------------------------------------------------------------------");
        for (int t = 0; t < imgzs.size(); t++){
            //Log.i("MyApplication", "NÚMERO: "+imgzs.get(t).getIndice());
            //Log.i("MyApplication", "IMAGEM 1: "+imgzs.get(t).getNomeDaImagem1());
            //Log.i("MyApplication", "IMAGEM 2: "+imgzs.get(t).getNomeDaImagem2());
        }
        //Log.i("MyApplication", "------------------------------------------------------------------------------");

    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Boolean getVer_resposta() {
        return ver_resposta;
    }

    public ArrayList<Questao> getListaDeQuestoes() {
        return listaDeQuestoes;
    }

    public void setListaDeQuestoes(ArrayList<Questao> listaDeQuestoes) {
        this.listaDeQuestoes = listaDeQuestoes;
      /*  //Log.i("MyApplication", "------------------------------------------------------------------------------");
        //Log.i("MyApplication", "setListaDeQuestoes");
        for (int t = 0; t < listaDeQuestoes.size(); t++){
            //Log.i("MyApplication", "index: "+t+" isSelecionada: "+listaDeQuestoes.get(t).isSelecionada());
        }
        //Log.i("MyApplication", "------------------------------------------------------------------------------");
*/
    }

    public void setVer_resposta(Boolean ver_resposta) {
        this.ver_resposta = ver_resposta;
    }

    public Boolean getSee_results() {
        return see_results;
    }

    public void setSee_results(Boolean see_results) {
        this.see_results = see_results;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public void setRespostas(String[] respostas) {
        this.respostas = respostas;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int pos) {
        this.posicao = pos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String mat) {
        this.materia = mat;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String b_ano) {
        this.ano = b_ano;
    }
}
