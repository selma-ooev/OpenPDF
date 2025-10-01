module com.github.librepdf.html {

	requires com.github.librepdf.openpdf;

	requires java.desktop;
	requires java.xml;
	requires java.logging;
	requires jdk.xml.dom;

	requires static com.google.errorprone.annotations;
	requires static org.jspecify;
	requires org.slf4j;

	exports org.openpdf.context;
	exports org.openpdf.css.constants;
	exports org.openpdf.css.extend;
	exports org.openpdf.css.extend.lib;
	exports org.openpdf.css.newmatch;
	exports org.openpdf.css.parser;
	exports org.openpdf.css.parser.property;
	exports org.openpdf.css.sheet;
	exports org.openpdf.css.style;
	exports org.openpdf.css.style.derived;
	exports org.openpdf.css.util;
	exports org.openpdf.css.value;
	exports org.openpdf.event;
	exports org.openpdf.extend;
	exports org.openpdf.html;
	exports org.openpdf.layout;
	exports org.openpdf.layout.breaker;
	exports org.openpdf.newtable;
	exports org.openpdf.pdf;
	exports org.openpdf.pdf.util;
	exports org.openpdf.render;
	exports org.openpdf.resource;
	exports org.openpdf.simple;
	exports org.openpdf.simple.extend;
	exports org.openpdf.simple.extend.form;
	exports org.openpdf.swing;
	exports org.openpdf.test;
	exports org.openpdf.util;
}
