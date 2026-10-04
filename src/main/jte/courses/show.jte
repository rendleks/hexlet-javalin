@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page


@template.layout.page(
    content = @`
        <h1>${page.getCourse().getName()}</h1>
        <p>${page.getCourse().getDescription()}</p>
        <ul>
            <li>1. http</li>
            <li>2. javalin</li>
            <li>3. jte (java template engine)</li>
        </ul>
    `
)