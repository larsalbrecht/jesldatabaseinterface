_This is the Wiki for the project **JESLDatabaseInterfaceParser**._


# Quick Start #
Go to the source-tab and checkout the code. Now you only need to download JDOM from http://www.jdom.org.

You can now compile the source. To test the library, you can actually start the parser with the XML-File as an argument.
It can be looks like this:
javafile /test.xml

## Use in own Project ##
If you want to use the library in your own project, you must first compile the code to a jar file.

Now you can use this code to parse an XML-File:
```
		final Parser p = new Parser(new File("/your/path/to.xml"));
		try {
			p.parseFile();
		} catch (final JDOMException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
```