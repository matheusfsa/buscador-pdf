package com.ed2.buscador.api.controllers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ed2.buscador.api.dtos.PDFsDto;
import com.ed2.buscador.api.dtos.QueryDto;
import com.ed2.buscador.api.response.Response;
import com.ed2.buscador.api.util.Query;
import com.ed2.buscador.api.util.Reader;



@RestController
@RequestMapping("/api/consulta")
@CrossOrigin(origins = "*")
public class SearchController {
	private static final Logger log = LoggerFactory.getLogger(SearchController.class);
	public SearchController() {
	}
	@PostMapping
	public ResponseEntity<Response<PDFsDto>> busca_pdfs(@RequestBody QueryDto queryPFDto){
		
		Response<PDFsDto> response = new Response<>();
		Query q = new Query(queryPFDto.getQuery(),queryPFDto.getLocal(),  Reader.readTST("tst.obj"),  Reader.readTST("tst_titulo.obj"));
		q.execute();
		PDFsDto pdfs = new PDFsDto();
		pdfs.setPdfs(new ArrayList<>(q.getResultado().getPdfs()));
		pdfs.setTempo(q.getTime());
		pdfs.setN_pdfs(q.getResultado().getPdfs().size());
		response.setData(pdfs);
		return ResponseEntity.ok(response);
	}
}
