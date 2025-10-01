module com.github.librepdf.pdfToolbox {

	requires com.github.librepdf.openpdf;

	requires java.desktop;

	requires org.jfree.jfreechart;
	requires jcommon;

	exports org.openpdf.toolbox;
	exports org.openpdf.toolbox.arguments;
	exports org.openpdf.toolbox.arguments.filters;
	exports org.openpdf.toolbox.plugins;
	exports org.openpdf.toolbox.plugins.watermarker;
	exports org.openpdf.toolbox.swing;
	exports org.openpdf.tools;
}
