@import org.example.hexlet.dto.courses.CoursesPage
@import org.example.hexlet.dto.courses.UsersPage
@param UsersPage page

@template.layout.page(
content = @`
    <style>
        table {
          width: 100%;
          border-collapse: collapse; /* Убирает двойные рамки между ячейками */
          font-family: sans-serif;
        }

        th, td {
          padding: 10px 14px;
          text-align: left;
          border-bottom: 1px solid #dddddd; /* Горизонтальные линии */
        }

        th {
          background-color: #f4f4f4;
          font-weight: bold;
        }

        /* Эффект «зебры» для строк */
        tr:nth-child(even) {
          background-color: #f9f9f9;
        }

        /* Подсветка строки при наведении */
        tr:hover {
          background-color: #f1f1f1;
        }
    </style>
    <h1>${page.getHeader()}</h1>
    @if(page.getUsers().isEmpty())
        <p>Пока не добавлено ни одного пользователя</p>
    @else
        <table>
        <tr>
            <th>id</th>
            <th>Имя</th>
            <th>Почта</th>
        </tr>
        @for(var user : page.getUsers())
                <tr>
                    <td>${user.getId()}</td>
                    <td>${user.getName()}</td>
                    <td>${user.getEmail()}</td>
                </tr>
        @endfor
        </table>
    @endif
<%--    <form action="/users" method="get">--%>
<%--        <input type="search" name="term" value="${page.getTerm()}" />--%>
<%--        <input type="submit" value="Search" />--%>
<%--    </form>--%>
`
)