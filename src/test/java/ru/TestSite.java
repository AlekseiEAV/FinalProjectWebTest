package ru;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import java.time.Duration;

public class TestSite {
    private static Page page;
    private static InputText inputText;
    private static AssertText assertText;
    private static ButtonClick buttonClick;
    public static WebDriver webDriver;
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/alekseiegorov/Documents/GitHub/FinalTestProjectSF/src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        page = new Page(webDriver);
        inputText = new InputText(webDriver);
        assertText = new AssertText(webDriver);
        buttonClick = new ButtonClick(webDriver);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        webDriver.manage().window().maximize();
    }


    @Test
    public void searchBlogPositive(){
        page.goBlog();
        buttonClick.goToElementSearchIcon();
        inputText.inputSearchText("Тестирование");

        String backText = assertText.getActiveTextPageSpan("Тестирование");
        assertEquals("Тестирование", backText);
    }
    @Test
    public void searchBlogNegative(){
        page.goBlog();
        buttonClick.goToElementSearchIcon();
        inputText.inputSearchText("rfgwrf");

        String backText = assertText.getActiveTextPageH1("Ничего не найдено");
        assertEquals("Ничего не найдено", backText);
    }
    @Test
    public void moveButtonBlogPage1(){
        page.goBlog();
        buttonClick.clickButtonPage("Выбор профессии");

        String backText = assertText.getActiveTextPageH1("Выбор профессии");
        assertEquals("Выбор профессии", backText);
    }
    @Test
    public void moveButtonBlogPage2(){
        page.goBlog();
        buttonClick.clickButtonPage("Data Science");

        String backText = assertText.getActiveTextPageH1("Data Science");
        assertEquals("Data Science", backText);
    }
    @Test
    public void moveButtonBlogPage3(){
        page.goBlog();
        buttonClick.clickButtonPage("Программирование");

        String backText = assertText.getActiveTextPageH1("Программирование");
        assertEquals("Программирование", backText);
    }
    @Test
    public void moveButtonBlogPage4(){
        page.goBlog();
        buttonClick.clickButtonPage("Аналитика данных");

        String backText = assertText.getActiveTextPageH1("Аналитика данных");
        assertEquals("Аналитика данных", backText);
    }
    @Test
    public void moveButtonBlogPage5(){
        page.goBlog();
        buttonClick.clickButtonPage("Вопрос-ответ");

        String backText = assertText.getActiveTextPageH1("Вопрос-ответ");
        assertEquals("Вопрос-ответ", backText);
    }
    @Test
    public void moveButtonBlogPage6(){
        page.goBlog();
        buttonClick.clickButtonPage("Получение опыта");

        String backText = assertText.getActiveTextPageH1("Получение опыта");
        assertEquals("Получение опыта", backText);
    }
    @Test
    public void searchDictionaryPositive(){
        page.goBlog();
        buttonClick.clickButtonPage("Словарь терминов");
        buttonClick.clickButtonPage("E");

        String backText = assertText.getActiveTextPageA("Excel");
        assertEquals("Excel", backText);
    }
    @Test
    public void searchDictionaryNegative(){
        page.goBlog();
        buttonClick.clickButtonPage("Словарь терминов");
        buttonClick.clickButtonPage("Z");

        String backText = assertText.getActiveTextPageLi("No matching entries");
        assertEquals("No matching entries", backText);
    }


    @Test
    public void goTheButtonAllCourses(){
        page.goMain();
        buttonClick.clickButtonPageUp("Все курсы");
        buttonClick.clickButtonPage("Дизайн");

        String backText = assertText.getActiveTextPageH1("Курсы дизайна");
        assertEquals("Курсы дизайна", backText);

    }
    @Test
    public void goTheButtonAllCourses2(){
        page.goMain();
        buttonClick.clickButtonPageUp("Все курсы");
        buttonClick.clickButtonPage("Программирование");

        String backText = assertText.getActiveTextPageH1("Курсы программирования");
        assertEquals("Курсы программирования", backText);
    }
    @Test
    public void goTheButtonAllCourses3(){
        page.goMain();
        buttonClick.clickButtonPageUp("Программирование");
        buttonClick.clickButtonPage("Java");

        String backText = assertText.getActiveTextPageH1("Курсы Java");
        assertEquals("Курсы Java", backText);
    }
    @Test
    public void goTheButtonContacts(){
        page.goMain();
        buttonClick.clickButtonPage("Контакты");

        String backText = assertText.getActiveTextPageH1("Контактная информация");
        assertEquals("Контактная информация", backText);
    }
    @Test
    public void goTheButtonAllReview(){
        page.goMain();
        buttonClick.clickButtonPage("Все отзывы и интервью");

        String backText = assertText.getActiveTextPageSpan("Отзывы студентов SkillFactory");
        assertEquals("Отзывы студентов SkillFactory", backText);
    }


    @Test
    public void searchCoursesDropBoxMenu(){
        page.goMain();
        buttonClick.goToButtonMenu("Онлайн-курсы");
        buttonClick.goToElementFromMenu("Тестирование");

        String backText = assertText.getActiveTextPageH1("Курсы по тестированию");
        assertEquals("Курсы по тестированию", backText);
    }
    @Test
    public void searchCoursesDropBoxMenu2(){
        page.goMain();
        buttonClick.goToButtonMenu("Онлайн-курсы");
        buttonClick.goToElementFromMenu("Разработка игр");

        String backText = assertText.getActiveTextPageH1("Курсы по разработке игр");
        assertEquals("Курсы по разработке игр", backText);
    }


    @Test
    public void goTheButtonVacancy(){
        page.goMain();
        buttonClick.clickButtonPage("Вакансии");

        String backText = assertText.getActiveTextPageDiv("Вакансии");
        assertEquals("Вакансии", backText);
    }
    @Test
    public void searchVacancyPositive(){
        page.goMain();
        buttonClick.clickButtonPage("Вакансии");
        inputText.inputSearchTextVacancy("Менеджер по работе с партнерами");

        String backText = assertText.getActiveTextPageDiv("Найдено:");
        assertEquals("Найдено: 1", backText); //На момент написания, при поиске выдавало одну вакансию
    }
    @Test
    public void searchVacancyNegative(){
        page.goMain();
        buttonClick.clickButtonPage("Вакансии");
        inputText.inputSearchTextVacancy("efgrgs");

        String backText = assertText.getActiveTextPageDiv("Ничего не найдено");
        assertEquals("Ничего не найдено",backText);
    }


    @Test
    public void checkMessageIncorrectMail(){
        page.goMain();
        inputText.inputName("Антон");
        inputText.inputMail("mail@mail");
        inputText.inputPhone("9258793191");

        String text = assertText.getErrorCoursesXpath();
        assertEquals("Укажите, пожалуйста, корректный email", text);
    }
    @Test
    public void checkMessageIncorrectName(){
        page.goMain();
        inputText.inputName("Антон2312");
        inputText.inputMail("mail@mail.ru");
        inputText.inputPhone("9258793191");

        String text = assertText.getErrorCoursesXpath();
        assertEquals("Укажите, пожалуйста, имя", text);
    }
    @Test
    public void checkMessageIncorrectPhone(){
        page.goMain();
        inputText.inputName("Антон");
        inputText.inputMail("mail@mail.ru");
        inputText.inputPhone("1111111111");

        String text = assertText.getErrorCoursesXpath();
        assertEquals("Укажите, пожалуйста, корректный номер телефона", text);
    }
    @Test
    public void checkMessageShortPhone(){
        page.goMain();
        inputText.inputName("Антон");
        inputText.inputMail("mail@mail.ru");
        inputText.inputPhone("92587941");

        String text = assertText.getErrorCoursesXpath();
        assertEquals("Слишком короткое значение", text);
    }
    @Test
    public void checkMessageEmptyFields(){
        page.goMain();
        inputText.inputName(" ");
        inputText.inputMail(" ");
        inputText.inputPhone(" ");

        String text = assertText.getErrorCoursesXpath();
        assertEquals("Пожалуйста, заполните все обязательные поля", text);
    }

    @AfterClass
    public static void pageClose(){
        webDriver.close();
    }
}

