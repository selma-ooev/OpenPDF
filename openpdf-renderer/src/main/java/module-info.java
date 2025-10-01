module com.github.librepdf.render {

	requires java.desktop;

	exports org.openpdf.renderer;
	exports org.openpdf.renderer.action;
	exports org.openpdf.renderer.annotation;
	exports org.openpdf.renderer.colorspace;
	exports org.openpdf.renderer.decode;
	exports org.openpdf.renderer.decrypt;
	exports org.openpdf.renderer.font;
	exports org.openpdf.renderer.font.cid;
	exports org.openpdf.renderer.font.ttf;
	exports org.openpdf.renderer.function;
	exports org.openpdf.renderer.function.postscript;
	exports org.openpdf.renderer.function.postscript.operation;
	exports org.openpdf.renderer.pattern;
}
