
@template.layout.page(
        content = @`
    <style>
        /* Контейнер формы */
            form {
              max-width: 400px;
              margin: 0 auto;
              padding: 20px;
              background-color: #f9f9f9;
              border-radius: 8px;
              box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            }

            /* Метки (подписи к полям) */
            label {
              display: block;
              margin-bottom: 6px;
              font-weight: bold;
              color: #333;
            }

            /* Поля ввода и текстовые области */
            input[type="text"],
            input[type="email"],
            input[type="password"],
            textarea {
              width: 100%;
              padding: 10px;
              margin-bottom: 15px;
              border: 1.5px solid #ccc;
              border-radius: 4px;
              box-sizing: border-box; /* Учитывает padding и border в общей ширине */
              font-size: 16px; /* Предотвращает автозум на iOS */
              transition: border-color 0.3s ease;
            }

            /* Состояние фокуса */
            input:focus,
            textarea:focus {
              outline: none;
              border-color: #007bff;
            }

            /* Кнопка отправки */
            input[type="submit"] {
              width: 100%;
              padding: 12px;
              background-color: #007bff;
              color: #white;
              border: none;
              border-radius: 4px;
              font-size: 16px;
              cursor: pointer;
              transition: background-color 0.3s ease;
            }

            input[type="submit"]:hover {
              background-color: #0056b3;
            }

    </style>
    <form action="/users" method="post">
        <div>
            <label for="">
                Name
                <input type="text" name="name" />
            </label>
        </div>
        <div>
            <label for="">
                Email
                <input type="email" required name="email" />
            </label>
        </div>
        <div>
            <label for="">
                Password
                <input type="password" required name="password" />
            </label>
            <div>
                <label for="">
                    Password confirmation
                    <input type="password" required name="passwordConfirmation" />
                </label>
            </div>
        </div>
        <input type="submit" value="Зарегистрировать" />
    </form>

   `
)
