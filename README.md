# Сервис отправки локализованных сообщений

В классе Main, создается тестовая отправка сообщения в консоль.  
  
В репозитории [cервис отправки сообщений](https://github.com/neee/geo-service) находится код приложения отправки локализованных сообщений, в котором на основе ip-адреса, переданного в заголовке, определяется язык отправляемого сообщения. ip-адрес начинающийся со “172.” относится к российскому сегменту, а с “96.” - к американскому. Для российских адресов отправляется текст на русском, а для американских адресов и всех остальных - на английском. Наша задача написать/добавить unit-тесты с использованием библиотеки mockito для проверки корректности работы функционала.

Что нужно сделать:

  -Написать тесты для проверки языка отправляемого сообщения (класс MessageSender) с использованием Mockito.  
  -Проверить, что MessageSenderImpl всегда отправляет только русский текст, если ip относится к российскому сегменту адресов.  
  -Проверить, что MessageSenderImpl всегда отправляет только английский текст, если ip относится к американскому сегменту адресов.  
  -Написать тесты для проверки определения локации по ip (класс GeoServiceImpl).  
  -Проверить работу метода public Location byIp(String ip).  
  -Написать тесты для проверки возвращаемого текста (класс LocalizationServiceImpl).  
  -Проверить работу метода public String locale(Country country).  
