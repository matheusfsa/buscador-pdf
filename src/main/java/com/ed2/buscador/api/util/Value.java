package com.ed2.buscador.api.util;

import java.io.Serializable;
import java.util.HashSet;

public class Value implements Serializable {
	private HashSet<PDF> pdfs;
	
	public Value(HashSet<PDF> pdfs) {
		this.pdfs = pdfs;
	}

	public HashSet<PDF> getPdfs() {
		return pdfs;
	}

	public void setPdfs(HashSet<PDF> pdfs) {
		this.pdfs = pdfs;
	}

	@Override
	public String toString() {
		String res = "";
		for (PDF string : pdfs) {
			res += string.getTitulo() + " ";
		}
		return res;
	}
	
}
