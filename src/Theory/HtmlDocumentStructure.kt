package Theory

class HtmlDocumentStructure {
    //doctype
    //Каждый HTML документ, отвечающий спецификации HTML какой-либо версии (мы будем указывать последнюю версию),
    //обязан начинаться со строки декларации версии HTML, делается это с помощью объявления <!DOCTYPE> следующим образом:

    //<!DOCTYPE html>

    //Эта строка поможет браузеру определить, как правильно интерпретировать код полученной веб-страницы.
    //В данном случае мы говорим браузеру, что HTML соответствует последнему стандарту спецификации.

    //Хотя слово doctype размещается в угловых скобках (< и >), оно не является тегом, это инструкция,
    //предназначенная специально для браузеров, и восклицательный знак (!) в начале отличает ее от остального кода в HTML-документе.

    //Элемент html
    //После объявления версии и типа документа необходимо обозначить его начало и конец, делается это с помощью элемента <html>:

    //<!DOCTYPE html>
    //<html>
    //</html>

    //Это элемент также называют корневым, потому что все остальные элементы документа располагаются в нем.
    //Корневой элемент может иметь только два дочерних элемента: <head> и <body>.

    //Элемент head
    //Элемент <head> является контейнером для других элементов, которые предоставляют информацию о документе, известную как метаданные.
    //Эти метаданные сообщают браузеру о местонахождении внешних скриптов и таблиц стилей, устанавливая отношение между текущим документом и другими ресурсами,
    //и могут предоставлять дополнительные данные, предназначенные для браузеров.
    //Помимо обязательного элемента <title>, браузеры не отображают никакие метаданные, находящиеся внутри элемента <head>.
    //Элемент <head> должен быть первым дочерним элементом <html>, никакое содержимое или элементы не должны располагаться перед ним:

    //<!DOCTYPE html>
    //<html>
    //  <head>
    //  </head>
    //</html>

    //Элемент title
    //Элемент <title> предоставляет текстовый заголовок для документа.
    //Каждый HTML-документ должен иметь ровно один элемент <title>, который должен располагаться внутри элемента <head>:

    //<head>
    // <title>Заголовок окна</title>
    //  </head>

    //Элемент body
    //Элемент <body> является контейнером для всего содержимого веб-страницы.
    //Все, что отображается в окне браузера и видит пользователь, содержится в нем
    //(у каждого HTML-документа может быть только один элемент <body>).
    //Его основная цель - отделить содержимое документа от метаданных.


    // Какую структуру должен иметь ваш веб-сайт?
    //Далее, давайте взглянем на то, какую структуру должен иметь наш тестовый сайт. Наиболее распространённые вещи,
    //присутствующие в любом проекте сайта, которые мы создаём: индексный файл HTML и папки, содержащие изображения,
    //файлы стилей и файлы скриптов. Давайте создадим их сейчас:

    //index.html: Этот файл обычно содержит контент домашней страницы, то есть текст и изображения, которые люди видят,
    //когда они впервые попадают на ваш сайт.
    //Используя ваш текстовый редактор, создайте новый файл с именем index.html и сохраните его прямо внутри вашей папки test-site.

    //Папка images: Эта папка будет содержать все изображения, которые вы используете на вашем сайте. Создайте папку с именем images внутри вашей папки test-site.

    //Папка styles: Эта папка будет содержать CSS код, используемый для стилизации вашего контента (например, настройка текста и цвета фона).
    //Создайте папку с именем styles внутри вашей папки test-site.
    //Папка scripts: Эта папка будет содержать весь JavaScript-код,
    //используемый для добавления интерактивных функций на вашем сайте (например, кнопки которые загружают данные при клике).
    //Создайте папку с именем scripts внутри вашей папки test-site.

}