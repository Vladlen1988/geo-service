package i18nTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

class LocalizationServiceImplTest {

    @Test
    void locale() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String text = "Добро пожаловать";
        Assertions.assertEquals(text, localizationService.locale(Country.RUSSIA));
    }
}
