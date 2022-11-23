# _Тестовые сценарии_
##### Для запуска всех тестов сразу, выполните команду в консоли -
     mvn clean test
##### 1) **Тест `public void searchBlogPositive()`** - позитивный тест, предназначен для проверки <br>кореектности поиска на странице блог.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -test=ru.TestsSF#searchBlogPositive  

##### 2) **_Тест `public void searchBlogNegative()`_** - негативный тест, при отсуствии резульата <br> поиска выдает отрицательный ответ на странице блог.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#searchBlogNegative

##### 3) **_Тест `public void moveButtonBlogPage1()`_** - позитивный тест, позволяет проверить <br> корректность перехода на страницу "_Выбор профессии_" на странице блог.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#moveButtonBlogPage1

##### 4) **_Тест `public void moveButtonBlogPage2()`_** - позитивный тест, позволяет проверить <br> корректность перехода на страницу "Data Science" на странице блог.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#moveButtonBlogPage2

##### 5) **_Тест `public void moveButtonBlogPage3()`_** - позитивный тест, позволяет проверить <br> корректность перехода на страницу "Программирование" на странице блог.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#moveButtonBlogPage3

##### 6) **_Тест `public void moveButtonBlogPage4()`_** - позитивный тест, позволяет проверить <br> корректность перехода на страницу "Аналитика данных" на странице блог.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#moveButtonBlogPage4

##### 7) **_Тест `public void moveButtonBlogPage5()`_** - позитивный тест, позволяет проверить <br> корректность перехода на страницу "Вопрос-ответ" на странице блог.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#moveButtonBlogPage5

##### 8) **_Тест `public void moveButtonBlogPage6()`_** - позитивный тест, позволяет проверить <br> корректность перехода на страницу "Получение опыта" на странице блог.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#moveButtonBlogPage6

##### 9) **_Тест `public void searchDictionaryPositive()`_** - поззитивный тест, предзначаен <br> для проверки поиска  на странице библиотека по нажатию кнокпи(буквы).<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#searchDictionaryPositive

##### 10) **_Тест `public void searchDictionaryNegative()`_** - негативный тест, предзначаен <br> для проверки поиска на странице библиотека при отсутсвии результа во время <br> нажатия кнопки, выдает орицательный ответ.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#searchDictionaryNegative

##### 11) **_Тест `public void goTheButtonAllCourses()`_** - позитивный тест, проверяет <br> работоспособность перехода с главной страницы через ссылку/кнопку "все курсы" <br> к выбранным эллементам.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#goTheButtonAllCourses

##### 12) **_Тест `public void goTheButtonAllCourses2()`_** - позитивный тест, проверяет <br> работоспособность перехода  с главной страницы через ссылку/кнопку "все курсы" <br> к выбранным эллементам.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#goTheButtonAllCourses2

##### 13) **_Тест `public void goTheButtonAllCourses3()`_** - позитивный тест, проверяет <br> работоспособность перехода с главной страницы через ссылку/кнопку <br> "Программирование" к выбранным элементам.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#goTheButtonAllCourses3

##### 14) **_Тест `public void goTheButtonContacts()`_** - позитивный тест, проверяет <br> работоспособность перехода с главной страницы через ссылку/кнопку "контакты".<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#goTheButtonContacts

##### 15) **_Тест `public void goTheButtonAllReview()`**_ - позитивный тест, проверяет <br>работоспособность перехода с главной страницы через ссылку/кнопку "Все отзывы".<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#goTheButtonAllReview

##### 16) **_Тест `public void searchCoursesDropBoxMenu()`_** - позитивный тест, проверяет <br>работоспособность перехода с главной страницы через выпадающее меню <br>"Онлайн-курсы" к выбранным элементам.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#searchCoursesDropBoxMenu

##### 17) **_Тест `public void searchCoursesDropBoxMenu2()`_** - позитивный тест, проверяет работоспособность перехода с главной страницы через выпадающее меню <br>"Онлайн-курсы" к выбранным элементам.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#searchCoursesDropBoxMenu2

##### 18) **_Тест `public void goTheButtonVacancy()`_** - позитивный тест, проверяет работоспособность перехода с главной страницы через ссылку/кнопку "Вакансии".<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#goTheButtonVacancy

##### 19) **_Тест `public void searchVacancyPositive()`_** - позитивный тест, предназначен для проверки кореектности поиска на странице Вакансии.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#searchVacancyPositive

##### 20) **_Тест `public void searchVacancyNegative()`_** - негативный тест, предназначен для проверки кореектности поиска на странице Вакансии, при отсуствии резульата поиска выдает <br> отрицательный ответ.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#searchVacancyNegative

##### 21) **_Тест `public void checkMessageIncorrectMail()`_** - негативный тест, проверяет корректность ввода адреса электронной почты, при неправильном вводе выводит уведомление об ошибке ввода.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#checkMessageIncorrectMail

##### 22) **_Тест `public void checkMessageIncorrectName()`_** - негативный тест, проверяет корректность ввода в форму "Получите консультацию по выбору курса в IT" имени, при неправильном вводе выводит уведомление об ошибке ввода.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#checkMessageIncorrectName

##### 23) **_Тест `public void checkMessageIncorrectPhone()`_** - негативный тест, проверяет корректность ввода в форму "Получите консультацию по выбору курса в IT" мобильного номера телефона, при неправильном вводе выводит уведомление об ошибке ввода.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#checkMessageIncorrectPhone

##### 24) **_Тест `public void checkMessageShortPhone()`_** - негативный тест, проверяет корректность ввода в форму "Получите консультацию по выбору курса в IT" мобильного номера телефона, при неправильном вводе(корткое значение) выводит уведомление об ошибке ввода.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#checkMessageShortPhone

##### 25) **_Тест `public void checkMessageEmptyFields()`_** - негативный тест, проверяет корректность ввода в форму "Получите консультацию по выбору курса в IT" всех данных, при неправильном вводе(все ячейки пустые) выводит уведомление об ошибке ввода.<br><br>Для запуска данного теста выполните команду в консоли -
    mvn clean test -Dtest=ru.TestsSF#checkMessageEmptyFields
