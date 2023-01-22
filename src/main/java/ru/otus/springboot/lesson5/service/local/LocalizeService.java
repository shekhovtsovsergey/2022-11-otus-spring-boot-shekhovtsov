package ru.otus.springboot.lesson5.service.local;

import java.util.List;

public interface LocalizeService {

    String localized(String code, Object... args);

    List<String> localized(List<String> codes);

}
