package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.util.NamedRoutes;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,3,3,5,5,7,7,11,18,26,31,38,38,40,40,40,42,42,43,43,45,45,53,53,55,55,55,56,56,56,57,57,57,59,59,59,59,59,59,59,59,59,64,64,66,66,68,68,68,68,68,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <style>\n        table {\n          width: 100%;\n          border-collapse: collapse; ");
				jteOutput.writeContent("\n          font-family: sans-serif;\n        }\n\n        th, td {\n          padding: 10px 14px;\n          text-align: left;\n          border-bottom: 1px solid #dddddd; ");
				jteOutput.writeContent("\n        }\n\n        th {\n          background-color: #f4f4f4;\n          font-weight: bold;\n        }\n\n        ");
				jteOutput.writeContent("\n        tr:nth-child(even) {\n          background-color: #f9f9f9;\n        }\n\n        ");
				jteOutput.writeContent("\n        tr:hover {\n          background-color: #f1f1f1;\n        }\n    </style>\n\n\n    ");
				if (page.getFlash() != null) {
					jteOutput.writeContent("\n        <div class=\"alert alert-primary\" role=\"alert\">\n            ");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(page.getFlash());
					jteOutput.writeContent("\n        </div>\n    ");
				}
				jteOutput.writeContent("\n    ");
				if (page.getUsers().isEmpty()) {
					jteOutput.writeContent("\n        <p>Пока не добавлено ни одного пользователя</p>\n    ");
				} else {
					jteOutput.writeContent("\n        <table>\n        <tr>\n            <th>id</th>\n            <th>Имя</th>\n            <th>Почта</th>\n            <th>Действие</th>\n        </tr>\n        ");
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
						jteOutput.writeContent("</td>\n                    <td>\n                        <form");
						var __jte_html_attribute_0 = NamedRoutes.deleteUserPath(user.getId());
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
							jteOutput.writeContent(" action=\"");
							jteOutput.setContext("form", "action");
							jteOutput.writeUserContent(__jte_html_attribute_0);
							jteOutput.setContext("form", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" method=\"post\">\n                            <input type=\"submit\" value=\"Delete\" />\n                        </form>\n                    </td>\n                </tr>\n        ");
					}
					jteOutput.writeContent("\n        </table>\n    ");
				}
				jteOutput.writeContent("\n\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
