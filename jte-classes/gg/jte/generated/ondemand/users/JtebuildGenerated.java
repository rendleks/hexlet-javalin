package gg.jte.generated.ondemand.users;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {1,1,1,1,1,1,1,1,3,3,5,15,23,33,34,38,45,91,91,91,92,92,92,92,92,92};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <style>\n        ");
				jteOutput.writeContent("\n            form {\n              max-width: 400px;\n              margin: 0 auto;\n              padding: 20px;\n              background-color: #f9f9f9;\n              border-radius: 8px;\n              box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n            }\n\n            ");
				jteOutput.writeContent("\n            label {\n              display: block;\n              margin-bottom: 6px;\n              font-weight: bold;\n              color: #333;\n            }\n\n            ");
				jteOutput.writeContent("\n            input[type=\"text\"],\n            input[type=\"email\"],\n            input[type=\"password\"],\n            textarea {\n              width: 100%;\n              padding: 10px;\n              margin-bottom: 15px;\n              border: 1.5px solid #ccc;\n              border-radius: 4px;\n              box-sizing: border-box; ");
				jteOutput.writeContent("\n              font-size: 16px; ");
				jteOutput.writeContent("\n              transition: border-color 0.3s ease;\n            }\n\n            ");
				jteOutput.writeContent("\n            input:focus,\n            textarea:focus {\n              outline: none;\n              border-color: #007bff;\n            }\n\n            ");
				jteOutput.writeContent("\n            input[type=\"submit\"] {\n              width: 100%;\n              padding: 12px;\n              background-color: #007bff;\n              color: #white;\n              border: none;\n              border-radius: 4px;\n              font-size: 16px;\n              cursor: pointer;\n              transition: background-color 0.3s ease;\n            }\n\n            input[type=\"submit\"]:hover {\n              background-color: #0056b3;\n            }\n\n    </style>\n    <form action=\"/users\" method=\"post\">\n        <div>\n            <label for=\"\">\n                Name\n                <input type=\"text\" name=\"name\" />\n            </label>\n        </div>\n        <div>\n            <label for=\"\">\n                Email\n                <input type=\"email\" required name=\"email\" />\n            </label>\n        </div>\n        <div>\n            <label for=\"\">\n                Password\n                <input type=\"password\" required name=\"password\" />\n            </label>\n            <div>\n                <label for=\"\">\n                    Password confirmation\n                    <input type=\"password\" required name=\"passwordConfirmation\" />\n                </label>\n            </div>\n        </div>\n        <input type=\"submit\" value=\"Зарегистрировать\" />\n    </form>\n\n   ");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
