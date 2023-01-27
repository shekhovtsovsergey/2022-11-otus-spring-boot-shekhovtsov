package ru.otus.springboot.lesson7.service.local;

import java.util.List;

public interface LocalizeService {

    String localized(String code, Object... args);

    List<String> localized(List<String> codes);

}
