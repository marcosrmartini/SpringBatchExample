package br.com.mmartini;

import org.springframework.batch.item.ItemProcessor;

import br.com.mmartini.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {

		System.out.println("Processing..." + item);
		return item;
	}

}