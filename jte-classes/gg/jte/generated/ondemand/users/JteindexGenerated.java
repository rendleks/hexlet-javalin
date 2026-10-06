package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.courses.UsersPage;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,2,4,4,6,6,10,17,25,30,35,35,35,36,36,38,38,45,45,47,47,47,48,48,48,49,49,49,51,51,53,53,54,55,56,57,58,58,58,58,58,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <style>\n        table {\n          width: 100%;\n          border-collapse: collapse; ");
				jteOutput.writeContent("\n          font-family: sans-serif;\n        }\n\n        th, td {\n          padding: 10px 14px;\n          text-align: left;\n          border-bottom: 1px solid #dddddd; ");
				jteOutput.writeContent("\n        }\n\n        th {\n          background-color: #f4f4f4;\n          font-weight: bold;\n        }\n\n        ");
				jteOutput.writeContent("\n        tr:nth-child(even) {\n          background-color: #f9f9f9;\n        }\n\n        ");
				jteOutput.writeContent("\n        tr:hover {\n          background-color: #f1f1f1;\n        }\n    </style>\n    <h1>");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(page.getHeader());
				jteOutput.writeContent("</h1>\n    ");
				if (page.getUsers().isEmpty()) {
					jteOutput.writeContent("\n        <p>Пока не добавлено ни одного пользователя</p>\n    ");
				} else {
					jteOutput.writeContent("\n        <table>\n        <tr>\n            <th>id</th>\n            <th>Имя</th>\n            <th>Почта</th>\n        </tr>\n        ");
					for (var user : page.getUsers()) {
						jteOutput.writeContent("\n                <tr>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getId());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getName());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getEmail());
						jteOutput.writeContent("</td>\n                </tr>\n        ");
					}
					jteOutput.writeContent("\n        </table>\n    ");
				}
				jteOutput.writeContent("\n");
				jteOutput.writeContent("\n");
				jteOutput.writeContent("\n");
				jteOutput.writeContent("\n");
				jteOutput.writeContent("\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
