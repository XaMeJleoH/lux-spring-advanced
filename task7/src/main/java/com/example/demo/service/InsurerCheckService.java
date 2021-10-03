package com.example.demo.service;

import com.example.demo.model.CheckType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InsurerCheckService {
    private final boolean isCheck;
    private final List<CheckType> checkTypeList;

    public InsurerCheckService(InsurerSettingsComponent insurerSettingsComponent) {
        this.isCheck = insurerSettingsComponent.isCheck();
        this.checkTypeList = insurerSettingsComponent.getCheckTypes();
    }

    public void checkInsurer() {
        if (isCheck) {
            List<String> typeList = checkTypeList.stream()
                    .filter(checkType -> Boolean.TRUE.equals(checkType.isEnabled()))
                    .map(CheckType::getType)
                    .collect(Collectors.toUnmodifiableList());
            typeList.forEach(System.out::println);
        }
    }
}
