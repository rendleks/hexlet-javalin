@import org.example.hexlet.dto.MainPage
@import org.example.hexlet.util.NamedRoutes
@param MainPage page

@template.layout.page(
    content = @`
        @if(!page.isVisited())
            Это сообщение показывается только один раз.
            Если вы хотите увидеть его снова, сотрите куки
        @endif
        @if(page.getCurrentUser() == null)
            Пользователь, не залогенен:
            <a href="${NamedRoutes.sessionsPathBuild()}">login</a>
        @else
            Добро пожаловать, ${page.getCurrentUser()}.
            Чтобы разлогиниться, удалите куку JSESSIONID из браузера.
        @endif
        <h2>Главная страница!</h2>
        <p>Тут типо должен быть контент</p>
    `
)