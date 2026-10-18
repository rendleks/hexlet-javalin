@import gg.jte.Content
@import org.example.hexlet.util.NamedRoutes

@param Content content

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <menu>
        <li><a href="/">Main Page</a></li>
        <li><a href="${NamedRoutes.coursesPath()}">Courses</a></li>
        <li><a href="${NamedRoutes.usersPath()}">Users</a></li>
        <li><a href="${NamedRoutes.buildUserPath()}">Add user</a></li>
    </menu>
    <main>
        ${content}
    </main>
    <footer>
        <a href="https://github.com/rendleks">My GitHub Page</a>
    </footer>
</body>
</html>

@import io.hexlet.dto.posts.EditPostPage
@param EditPostPage page

@template.layout.page(
content = @`
    <!-- BEGIN (write your solution here) -->
<%--     @if(page.getErrors() != null)--%>
<%--            <ul>--%>
<%--                @for(var validator : page.getErrors().values())--%>
<%--        @for(var error : validator)--%>
<%--                        <li>${error.getMessage()}</li>--%>
<%--                    @endfor--%>
<%--        @endfor--%>
<%--            </ul>--%>
<%--        @endif --%>

    <form action="/posts/${page.getPost().getId()}" method="post">
        <label for="namePost">Title</label>
        <input type="text" name="name" id="namePost" value="${page.getPost().getName()}">
        <label for="bodyPost">Content</label>
        <textarea name="body" id="bodyPost" rows="3" autocomplete="on">${page.getPost().getBody()}</textarea>
        <input type="submit" value="Отправить">
    </form>
    <!-- END -->
`
)

