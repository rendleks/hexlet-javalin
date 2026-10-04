@import gg.jte.Content

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
        <li><a href="/courses">Courses</a></li>
    </menu>
    <main>
        ${content}
    </main>
    <footer>
        <a href="https://github.com/rendleks">My GitHub Page</a>
    </footer>
</body>
</html>
