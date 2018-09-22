package com.ed2.buscador.api.dtos;

import java.util.ArrayList;

import com.ed2.buscador.api.util.PDF;

public class PDFsDto {
	private double tempo;
	private int n_pdfs;
	private ArrayList<PDF> pdfs;

	
	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public int getN_pdfs() {
		return n_pdfs;
	}

	public void setN_pdfs(int n_pdfs) {
		this.n_pdfs = n_pdfs;
	}

	public ArrayList<PDF> getPdfs() {
		return pdfs;
	}

	public void setPdfs(ArrayList<PDF> pdfs) {
		this.pdfs = pdfs;
	}
	
}
