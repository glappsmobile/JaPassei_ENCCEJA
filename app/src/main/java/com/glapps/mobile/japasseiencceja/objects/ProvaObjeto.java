package com.glapps.mobile.japasseiencceja.objects;

import android.text.Spanned;

/**
 * Created by GlaucoVillasBoas on 10/07/2017.
 */

public class ProvaObjeto {

    Spanned sEnunciado;
    Spanned sqA;
    Spanned sqB;
    Spanned sqC;
    Spanned sqD;
    Spanned sqE;
    Spanned sResolucao;
    Spanned sPrerequisito;
    int especie;

    public ProvaObjeto() {
    }

    public int getEspecie() {
        return especie;
    }

    public void setEspecie(int especie) {
        this.especie = especie;
    }

    public Spanned getsEnunciado() {
        return sEnunciado;
    }

    public void setsEnunciado(Spanned sEnunciado) {
        this.sEnunciado = sEnunciado;
    }

    public Spanned getSqA() {
        return sqA;
    }

    public void setSqA(Spanned sqA) {
        this.sqA = sqA;
    }

    public Spanned getSqB() {
        return sqB;
    }

    public void setSqB(Spanned sqB) {
        this.sqB = sqB;
    }

    public Spanned getSqC() {
        return sqC;
    }

    public void setSqC(Spanned sqC) {
        this.sqC = sqC;
    }

    public Spanned getSqD() {
        return sqD;
    }

    public void setSqD(Spanned sqD) {
        this.sqD = sqD;
    }

    public Spanned getSqE() {
        return sqE;
    }

    public void setSqE(Spanned sqE) {
        this.sqE = sqE;
    }

    public Spanned getsResolucao() {
        return sResolucao;
    }


    public void setsResolucao(Spanned sResolucao) {
        this.sResolucao = sResolucao;
    }

    public Spanned getsPrerequisito() {
        return sPrerequisito;
    }

    public void setsPrerequisito(Spanned sPrerequisito) {
        this.sPrerequisito = sPrerequisito;
    }
}
