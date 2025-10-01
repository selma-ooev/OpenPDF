module com.github.librepdf.openpdf {

	requires java.desktop;

	requires static com.ibm.icu;
	requires static org.apache.xmlgraphics.fop;
	requires static org.apache.xmlgraphics.fop.core;
	requires static org.bouncycastle.pkix;
	requires static org.bouncycastle.provider;

	exports org.openpdf.bouncycastle;
	exports org.openpdf.text;
	exports org.openpdf.text.alignment;
	exports org.openpdf.text.error_messages;
	exports org.openpdf.text.exceptions;
	exports org.openpdf.text.factories;
	exports org.openpdf.text.html;
	exports org.openpdf.text.html.simpleparser;
	exports org.openpdf.text.pdf;
	exports org.openpdf.text.pdf.codec;
	exports org.openpdf.text.pdf.codec.wmf;
	exports org.openpdf.text.pdf.collection;
	exports org.openpdf.text.pdf.crypto;
	exports org.openpdf.text.pdf.draw;
	exports org.openpdf.text.pdf.events;
	exports org.openpdf.text.pdf.fonts;
	exports org.openpdf.text.pdf.fonts.cmaps;
	exports org.openpdf.text.pdf.hyphenation;
	exports org.openpdf.text.pdf.interfaces;
	exports org.openpdf.text.pdf.internal;
	exports org.openpdf.text.pdf.parser;
	exports org.openpdf.text.utils;
	exports org.openpdf.text.xml;
	exports org.openpdf.text.xml.simpleparser;
	exports org.openpdf.text.xml.xmp;
}
