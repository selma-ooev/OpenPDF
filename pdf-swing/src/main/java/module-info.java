module com.github.librepdf.pdfSwing {

	requires com.github.librepdf.openpdf;

	requires java.desktop;

	requires org.dom4j;
	requires pdf.renderer;

	exports org.openpdf.rups;
	exports org.openpdf.rups.controller;
	exports org.openpdf.rups.io;
	exports org.openpdf.rups.io.filters;
	exports org.openpdf.rups.model;
	exports org.openpdf.rups.view;
	exports org.openpdf.rups.view.icons;
	exports org.openpdf.rups.view.itext;
	exports org.openpdf.rups.view.itext.treenodes;
	exports org.openpdf.rups.view.models;
}
