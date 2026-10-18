@import org.example.hexlet.dto.MainPage
@param MainPage page

@template.layout.page(
    content = @`
        @if(!page.isVisited())
            Это сообщение показывается только один раз.
            Если вы хотите увидеть его снова, сотрите куки
        @endif
        <h2>Главная страница!</h2>
        <p>Тут типо должен быть контент</p>
    `
)